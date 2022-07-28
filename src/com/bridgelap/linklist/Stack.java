package com.bridgelap.linklist;

    public class Stack<T> {
        LinkList<T> linkedList;
        public Stack(){
            this.linkedList = new LinkList<>();
        }
        public void push(T key) {
            linkedList.push(key);
        }
        public void print() {
            linkedList.print();
        }

        public T pop() {
            return linkedList.pop();
        }

    }
