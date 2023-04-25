package ch.allianz.lehrlinge.demo;

import ch.allianz.lehrlinge.model.Data;
import ch.allianz.lehrlinge.observer.impl.ObserverImplOne;
import ch.allianz.lehrlinge.observer.impl.ObserverImplThree;
import ch.allianz.lehrlinge.observer.impl.ObserverImplTwo;
import ch.allianz.lehrlinge.observer.impl.SubjectImpl;

public class ObserverDemo {

	public static void main(String[] args) {
		ObserverDemo demo = new ObserverDemo();
		demo.start();
	}

	public void start() {
		ObserverImplOne observer1 = new ObserverImplOne();
		ObserverImplTwo observer2 = new ObserverImplTwo();
		ObserverImplThree observer3 = new ObserverImplThree();
		SubjectImpl subject = new SubjectImpl();
		subject.addObserver(observer1);
		subject.addObserver(observer2);
		subject.addObserver(observer3);
		subject.setData(new Data("Peter","Meyer",25));
		subject.removeObserver(observer2);
		subject.setData(new Data("Milos", "Peric", 18));
		
	}
}