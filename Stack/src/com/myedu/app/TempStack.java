package com.myedu.app;

public class TempStack <Item>{
    private  Item[] a;
    private  int N;
    public  TempStack(int cap){
        a = (Item[]) new Object[cap];
    }
    public boolean IsEmplty(){
        return N==0;
    }
    public int size(){
        return N;
    }
    public void Push(Item item){
        if(a.length==N) resize(2*a.length);
        a[N++]=item;
    }
    public Item pop(){
        Item item = a[--N];
        a[N]=null;
        if(N>0 && N==a.length/4) resize((a.length/2));
        return a[N--];
    }
    private void  resize(int max){
      Item[] temp = (Item[]) new Object[max];
      for(int i=0;i<N;i++)
          temp[i]=a[i];
      a=temp;
    }

}
