package ch.allianz.lehrlinge.observer.impl;

import ch.allianz.lehrlinge.model.Data;
import ch.allianz.lehrlinge.observer.api.Observer;

public class ObserverImplTwo implements Observer {

	@Override
	public void update(Object o) {
		System.out.println("Observer 2: "+((Data)o).toString());
	}


}
