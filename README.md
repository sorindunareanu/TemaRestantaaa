In implementarea temei vom gasi:
-4 design pattern-uri:Factory,Observer,Adapter si Singleton
-erori customizate
-diagrama
-testele junit 

Am definit pachete pentru fiecare pattern pentru a vedea implementarea lor cu clasele specifice.

mta.singleton.pattern:
1.am implementat clasa CarFactory ca singleton pentru pattern-ul Factory;
2.test jUnit "CarFactoryTest";

mta.factory.pattern:
1.am definit 3 tipuri de masini;
2.pentru fiecare tip, se construieste modelul ales

mta.observer.pattern:
1.am definit pentru fiecare tip de masina cate un observator care permite afisarea nr de km pe care o masina poate sa mearga in fc de consulul lor.Se seteaza nr de litri general(subject.setState(100);).

mta.adapter.pattern:
1.orice tip de masina poate citi "VLC" sau "MP4" dar cu pattern-ul adapter se pot implementa alte formate media.
2.s-au dat exemple pentru "jeep car" si "small car".

