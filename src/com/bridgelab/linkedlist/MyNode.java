package com.bridgelab.linkedlist;

public class MyNode<K> {
	private K key;
	MyNode next;

	public MyNode(K key) {
		this.key = key;
		this.next = null;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key){
		this.key = key;
	}

	public MyNode getNext(){
		return next;
	}

	public void SetNext(MyNode next) {
		this.next = next;
	}
}
