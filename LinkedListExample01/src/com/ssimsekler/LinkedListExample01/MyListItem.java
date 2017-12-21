package com.ssimsekler.LinkedListExample01;

public class MyListItem extends AbsMyListItem {

	public MyListItem(Object value, AbsMyListItem previous, AbsMyListItem next) {
		super(value, previous, next);

	}

	@Override
	public byte compareTo(AbsMyListItem otherItem) {

		if (otherItem == null) {
			return -1;
		}
		return (byte) Math.signum(this.value.toString().compareTo(otherItem.getValue().toString()));

	}

}
