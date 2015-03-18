package mta.adapter.pattern;

public class JeepCarAudioPlayer implements MediaPlayer {

	@Override
	public void play(String audioType, String filename) {
		// TODO Auto-generated method stub

		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file. Name: " + filename);
		}

		// mediaAdapter is providing support to play other file formats
		else if (audioType.equalsIgnoreCase("vlc")) {
			MediaAdapter mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, filename);
		}

		else {
			System.out.println("Invalid media. " + audioType
					+ " format not supported");
		}
	}
}
