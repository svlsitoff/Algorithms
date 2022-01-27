package com.myedu.app;

public class TempStack <Item>{
    //стек содержит массив обьектов ссылочного типа
    private  Item[] a;
    //число отражающее размер массива
    private  int N;
    //в кострукторе указываем размер массива
    public  TempStack(int cap){
        a = (Item[]) new Object[cap];
    }

    public boolean IsEmplty(){
        return N==0;
    }
    public int size(){
        return N;
    }
    //При помещении элемнта в массив
    //если его первоначальный размер превышен
    //длина увеличивается в два раза
    public void Push(Item item){
        if(a.length==N){
            resize(2*a.length);
        }
        a[N++]=item;
    }
    //при уменьшении размера массива
    //крайнему элементу присваивается
    // null и если есьвозможность дли
    // нассива уменьшается в два раза
    public Item pop(){
        Item item = a[--N];
        a[N]=null;
        if(N>0 && N==a.length/4) resize((a.length/2));
        return item;
    }
    private void  resize(int max){
      Item[] temp = (Item[]) new Object[max];
      for(int i=0;i<N;i++)
          temp[i]=a[i];
      a=temp;
    }

}
