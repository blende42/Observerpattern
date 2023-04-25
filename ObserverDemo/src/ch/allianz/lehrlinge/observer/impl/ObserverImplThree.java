package ch.allianz.lehrlinge.observer.impl;

import ch.allianz.lehrlinge.model.Data;
import ch.allianz.lehrlinge.observer.api.Observer;

public class ObserverImplThree implements Observer {

	@Override
	public void update(Object o) {
		System.out.println("Observer 3: "+((Data)o).toString());
	}

}
