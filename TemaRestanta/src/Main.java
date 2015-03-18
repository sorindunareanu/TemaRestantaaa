import mta.adapter.pattern.JeepCarAudioPlayer;
import mta.adapter.pattern.SmallCarAudioPlayer;
import mta.exception.MyException;
import mta.factory.pattern.CarType;
import mta.observer.pattern.JeepCarObserver;
import mta.observer.pattern.LuxuryCarObserver;
import mta.observer.pattern.SmallCarObserver;
import mta.observer.pattern.Subject;
import mta.singleton.pattern.CarFactory;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {

			CarFactory object = CarFactory.getInstance();

			System.out.println(object.buildCar(CarType.JEEP));
			System.out.println(object.buildCar(CarType.LUXURY));
			System.out.println(object.buildCar(CarType.SMALL));

			Subject subject = new Subject();
			new JeepCarObserver(subject);
			new LuxuryCarObserver(subject);
			new SmallCarObserver(subject);
			System.out.println("First charge is 100 l!!!!");
			subject.setState(100);
			System.out.println("First charge is 45 l!!!!");
			subject.setState(45);

			SmallCarAudioPlayer audioPlayer = new SmallCarAudioPlayer();

			audioPlayer.play("mp3", "beyond the horizon.mp3");
			audioPlayer.play("mp4", "alone.mp4");
			audioPlayer.play("vlc", "far far away.vlc");
			audioPlayer.play("avi", "mind me.avi");

			JeepCarAudioPlayer audioPlayer1 = new JeepCarAudioPlayer();

			audioPlayer1.play("mp3", "beyond the horizon.mp3");
			audioPlayer1.play("mp4", "alone.mp4");
			audioPlayer1.play("vlc", "far far away.vlc");
			audioPlayer1.play("avi", "mind me.avi");
		} catch (MyException e) {
			System.out.println("ERROR!!!!::::" + e.getMessage());
		}
	}

}
