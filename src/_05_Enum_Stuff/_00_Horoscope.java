package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	static void showHoroscope(Zodiac z) {
		switch(z){
		case ARIES:{
			JOptionPane.showMessageDialog(null, "Add a bit of spice in your life by engaging in spontaneous activities. It's time to get out and enjoy more of the world. Explore those things that are inherently different from what you'd expect to find. Pick the closed door instead of the open one through which you can see to the other side.");
			break;
		}
		case TAURUS:{
			JOptionPane.showMessageDialog(null, "There may be some emotional strain and tension in your world, but this can be remedied when you look at things in perspective. Don't get weighed down by passing moods that cripple your productivity. Focus on the things that are working well in your life and concentrate your energy on those. Your communication skills and humanitarianism will pull you out of your rut today.");
			break;
		}
		case GEMINI:{
			JOptionPane.showMessageDialog(null, "People may be bearing down hard on you. They will have some facts to back themselves up. Your brain is like a computer storing bits of information to use at times like this. No one is safe against a mental and emotional arsenal like yours. If you've done your homework and prepared well, the challenges should prove to be no problem for you.");
			break;
		}
		case CANCER:{
			JOptionPane.showMessageDialog(null, "This is a great day for you. You may feel like you can exercise more of your freedom. Break any shackles that seem to be holding you back. There's no reason to feel hindered. Your adventuresome attitude is brave, and there's a great deal of territory to conquer. Get focused and go. You have the green light.");
			break;
		}
		case LEO:{
			JOptionPane.showMessageDialog(null, "You're in a sticky emotional battle in which someone is trying to twist your words to make you look like the bad guy. As soon as you try to get a project started, someone moves counter to your aims. Perhaps this is all due to a misunderstanding. Take the time to clear the air in all your relationships.");
			break;
		}
		case VIRGO:{
			JOptionPane.showMessageDialog(null, "Friendships go surprisingly well for you now, so look to them for the support you seek. Future plans may be uncertain, so don't worry about them now. It's important to bask in each moment and give thanks for every breath. You should feel good, so take aggressive action.");
			break;
		}
		case LIBRA:{
			JOptionPane.showMessageDialog(null, "Lessons may come in odd shapes and sizes today, so don't feel like you need to make immediate sense of every little thing. Instead of overanalyzing everything and becoming paralyzed by the emotions you feel, take decisive action and make mistakes. This is where the lessons come in. Let them teach you what you need to know.");
			break;
		}
		case SCORPIO:{
			JOptionPane.showMessageDialog(null, "You're in for some unexpected surprises, but don't worry, because most of them will be exciting and welcome. Prepare yourself by being open and accepting of other people and the new situations they bring. The path of least resistance will take you exactly where you need to go. Move toward people who radiate loving, positive energy.");
			break;
		}
		case SAGITTARIUS:{
			JOptionPane.showMessageDialog(null, "You may feel like you're driving on a highway and suddenly all the lanes merge. This bottleneck should cause you tension and difficulty. Your first reaction may be to let all the other people go by. Keep in mind that on a day like this, you'll never get where you need to be unless you're more aggressive.");
			break;
		}
		case CAPRICORN:{
			JOptionPane.showMessageDialog(null, "You'll be at an advantage if you can learn to distance yourself from the emotional crux of the matter. Maintain a neutral viewpoint. It will be important in order for you to conduct yourself in the way you need to in order to be successful. Great flashes of inspiration result as long as you can keep your mental processes running smoothly.");
			break;
		}
		case AQUARIUS:{
			JOptionPane.showMessageDialog(null, "You may feel like a mouse trying to get the cheese in the middle of the kitchen floor. From your corner, you can see the cheese in the distance. Yet you know a cat lurks nearby. As soon as you step into the open and out of your protected spot, the cat will react quickly and with great force. You might just want to wait until another day before grabbing the cheese.");
			break;
		}
		case PISCES:{
			JOptionPane.showMessageDialog(null, "our emotions receive a boost of support from those around you. Be careful that you don't let this energy go to your head. This is a good day to sit back and gain perspective on things instead of assuming you have all the answers. Opportunities will come to you when you join a team of progressive thinkers who aren't afraid to push beyond current boundaries.");
			break;
		}
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		 Zodiac zodiac = Zodiac.AQUARIUS;
		 showHoroscope(zodiac);
	}
}
