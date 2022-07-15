package com.book.effectivejava.juu.chapter2.item7.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class BigObjectReference<BigObject> extends PhantomReference<BigObject> {

	public BigObjectReference(BigObject referent, ReferenceQueue<? super BigObject> q) {
		super(referent, q);
	}

	public void cleanUp() {
		System.out.println("clean up");
	}
}
