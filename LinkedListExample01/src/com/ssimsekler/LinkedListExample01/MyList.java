package com.ssimsekler.LinkedListExample01;

public class MyList {

	private AbsMyListItem head;

	public MyList(AbsMyListItem head) {
		super();
		this.head = head;
	}

	public AbsMyListItem getItem(Object value) {

		AbsMyListItem currentItem = head;

		do {
			if (currentItem.compareTo(new MyListItem(value, null, null)) == 0) {
				return currentItem;
			}
			currentItem = currentItem.next();
		} while (currentItem != null);
		return null;
	}

	public void addItem(AbsMyListItem newItem) {

		AbsMyListItem currentItem;

		if (this.head == null) {
			this.head = newItem;
		} else {
			currentItem = this.head;

			do {
				byte compResult = newItem.compareTo(currentItem);
				if (compResult == 0) {
					System.out.println("This item is already in the list");
					break;
				} else if (compResult < 0) {
					if (currentItem.previous() != null) {
						currentItem.previous().setNext(newItem);
					}
					newItem.setPrevious(currentItem.previous());
					newItem.setNext(currentItem);
					currentItem.setPrevious(newItem);
					if (currentItem == this.head) {
						this.head = newItem;
					}
					System.out.println("Item added: " + newItem.getValue().toString());
					break;
				} else if (currentItem.next() == null) {
					currentItem.setNext(newItem);
					newItem.setPrevious(currentItem);
					System.out.println("Item added: " + newItem.getValue().toString());
					break;
				}
				currentItem = currentItem.next();
			} while (currentItem != null);

		}

	}

	public void removeItem(AbsMyListItem delItem) {

		if (delItem == null) {
			System.out.println("No item to delete");
			return;
		}

		if (delItem.previous() != null) {
			delItem.previous().setNext(delItem.next());
		}
		if (delItem.next() != null) {
			delItem.next().setPrevious(delItem.previous());
			if (delItem == this.head) {
				head = delItem.next();
			}
		}
		delItem.setPrevious(null);
		delItem.setNext(null);

		System.out.println("Item removed: " + delItem.getValue().toString());

	}

	public void removeAll() {
		if (head == null) {
			System.out.println("No items in the list!");
		} else {
			AbsMyListItem currentItem = head;

			while (head.next() != null) {
				removeItem(head.next());
			}
			
			head.setPrevious(null);
			head.setNext(null);
			this.head = null;
		}
	}

	public void printItems() {

		if (head == null) {
			System.out.println("No items in the list!");
		} else {
			System.out.println("Printing items...");

			AbsMyListItem currentItem = head;

			while (currentItem != null) {
				System.out.println(currentItem.getValue().toString());
				currentItem = currentItem.next();
			}
		}
	}

}
