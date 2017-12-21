package com.ssimsekler.LinkedListExample01;

public abstract class AbsMyListItem {
	
	private AbsMyListItem previous;
	private AbsMyListItem next;
	
	private Object value;
	
	
	public AbsMyListItem(Object value, AbsMyListItem previous, AbsMyListItem next) {
		super();
		this.value = value;
		this.previous = previous;
		this.next = next;
	}


	public AbsMyListItem previous() {
		return previous;
	}


	public void setPrevious(AbsMyListItem previous) {
		this.previous = previous;
	}


	public AbsMyListItem next() {
		return next;
	}


	public void setNext(AbsMyListItem next) {
		this.next = next;
	}


	public Object getValue() {
		return value;
	}


	public void setValue(Object value) {
		this.value = value;
	}
	
	public abstract byte compareTo(AbsMyListItem otherItem);
	

}
