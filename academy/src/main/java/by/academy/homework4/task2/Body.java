package by.academy.homework4.task2;

import java.util.Objects;

public class Body {
	
	private Body.Lungs lungs;
	private Body.Heart heart;
	
	public Body() {
		super();
		heart = new Heart();
		lungs = new Lungs();
	}
	
	public class Heart {
		
		public Heart() {
			super();
		}

		public void live() {
			for(int i=0; i<=Integer.MAX_VALUE; i++) {
				if(i%100 == 0 & i != 0) {
					System.out.println("Knock-knock-knockin' on heaven's door");
					System.out.println(i);
				}
			}
		}
	}

	public class Lungs {
		
		public Lungs() {
			super();
		}

		public void live() {
			for(int i=0; i<=Integer.MAX_VALUE; i++) {
				if(i%50 == 0 & i != 0) {
					System.out.println("breathe in");
					System.out.println(i);
				}
				if(i%100 == 0 & i != 0) {
					System.out.println("breathe out");
					System.out.println(i);
				}
			}
		}
	}
	
	public void live() {
		lungs.live();
		heart.live();
		
		System.out.println("You stand on the shore and feel the salty smell of the wind that blows from the sea. \n"
				+ "And I believe that you are free, and life has only begun.\n"
				+ "");
	}

	public Body.Lungs getLungs() {
		return lungs;
	}

	public void setLungs(Body.Lungs lungs) {
		this.lungs = lungs;
	}

	public Body.Heart getHeart() {
		return heart;
	}

	public void setHeart(Body.Heart heart) {
		this.heart = heart;
	}

	@Override
	public int hashCode() {
		return Objects.hash(heart, lungs);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Body other = (Body) obj;
		return Objects.equals(heart, other.heart) && Objects.equals(lungs, other.lungs);
	}

	@Override
	public String toString() {
		return "Body [lungs=" + lungs + ", heart=" + heart + "]";
	}
}
