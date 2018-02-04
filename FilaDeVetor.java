package com.estruturadedados2.aula02;

public class FilaDeVetor {

	Object[] queue = new Object[5];

	int tail = -1;

	int head = 0;

	int qtd = 0;

	void queue(Object value) {
		if (!isFull()) {
			if (tail == queue.length - 1) {
				tail = -1;
			}
			tail++;
			queue[tail] = value;
			qtd++;
		} else {
			System.out.println("A fila está cheia");
		}

	}

	Object unqueue() {// Remover sempre da posição zero.
		if (!isEmpty()) {
			Object temp = queue[0];
			queue[0] = null;

			// qtd--;

			for (int i = 0; i < qtd - 1 /* ou qtd - 1 */; i++) {
				queue[i] = queue[i + 1];
			}
			queue[tail] = null;
			tail--;
			qtd--;
			return temp;
		} else {
			System.out.println("A fila está vazia!");
			return null;
		}
	}

	Object unqueue2() {
		if (!isEmpty()) {
			Object temp = queue[head];
			queue[head] = null;
			if (isLastIndex()) {
				head = -1;
			}
			head++;
			qtd--;
			return temp;
		} else {
			System.out.println("A fila está vazia!");
			return null;
		}

	}

	int size() {
		return qtd;
	}

	boolean isLastIndex() {
		return head == queue.length - 1;
	}

	Object head() {
		if (!isEmpty()) {
			return queue[head];
		} else {
			System.out.println("Fila vazia");
			return null;
		}
	}

	boolean isFull() {
		return qtd == queue.length;
	}

	boolean isEmpty() {
		return qtd == 0;
	}

	void print1() {
		for (int i = 0; i < qtd; i++) {
			Object remove = unqueue();
			System.out.print(remove + " ");
			queue(remove);
		}
	}

	void print2() {
		for (int i = 0; i < qtd; i++) {
			System.out.print(head() + " ");
			queue(unqueue());
		}
	}

	String print3() {
		String str = "";
		for (int i = 0; i < qtd; i++) {
			str += head() + " ";
			queue(unqueue());
		}
		return str;
	}

	void print() {

		if (!isEmpty()) {
			String str = "";

			for (int i = 0; i < qtd; i++) {
				str += queue[i];
			}

			System.out.println(str);
		} else {
			System.out.println("Fila vazia.");
		}

	}

}
