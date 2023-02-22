package D2_12_22;

public class Creative {
	public static void main(String[] args) throws InterruptedException {
		int n=5;
		int star;
		int space;
		{
			star=n;
			space=0;
		for (int i =1; i <=n; i++) {
			for (int j =1; j <=space; j++) {
				System.out.print("  ");}
			for (int j =1; j <=star; j++) {
				System.out.print("K ");
				Thread.sleep(100);}
			System.out.println();
			if (i<=n/2) {
				star-=2;
				space++;
			}else {
				star+=2;
				space--;}}
		System.out.println("-----------------");
		
		
		star=1;
		space=n/2;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=space; j++) {
				System.out.print("  ");}
			for (int j = 1; j <=star; j++) {
				System.out.print("i ");
				Thread.sleep(100);}
			System.out.println();
			if(i<=n/2){
				star+=2;
				space--;
			}else{
				star-=2;
				space++;}}
		System.out.println("-----------------");

		
		star=n;
		space=0;
		for (int i =1; i <=n; i++) {
			for (int j =1; j <=space; j++) {
				System.out.print("  ");}
			for (int j =1; j <=star; j++) {
				System.out.print("n ");
				Thread.sleep(100);}
			System.out.println();
			if (i<=n/2) {
				star-=2;
				space++;
			}else {
				star+=2;
				space--;}}
		System.out.println("-----------------");

		
		star=1;
		space=n/2;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=space; j++) {
				System.out.print("  ");}
			for (int j = 1; j <=star; j++) {
				System.out.print("g ");
				Thread.sleep(100);}
			System.out.println();
			if(i<=n/2){
				star+=2;
				space--;
			}else{
				star-=2;
				space++;}}
		System.out.println("-----------------");
		System.out.println("-----------------");
		
		
		star=n;
		space=0;
		for (int i =1; i <=n; i++) {
			for (int j =1; j <=space; j++) {
				System.out.print("  ");}
			for (int j =1; j <=star; j++) {
				System.out.print("A ");
				Thread.sleep(100);}
			System.out.println();
			if (i<=n/2) {
				star-=2;
				space++;
			}else {
				star+=2;
				space--;}}
		System.out.println("-----------------");
		
	
		star=1;
		space=n/2;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=space; j++) {
				System.out.print("  ");}
			for (int j = 1; j <=star; j++) {
				System.out.print("s ");
				Thread.sleep(100);}
			System.out.println();
			if(i<=n/2){
				star+=2;
				space--;
			}else{
				star-=2;
				space++;}}
		System.out.println("-----------------");
		
		star=n;
		space=0;
		for (int i =1; i <=n; i++) {
			for (int j =1; j <=space; j++) {
				System.out.print("  ");
			}
			for (int j =1; j <=star; j++) {
				System.out.print("M ");
				Thread.sleep(100);
			}
			System.out.println();
			
			if (i<=n/2) {
				star-=2;
				space++;
			}else {
				star+=2;
				space--;}}
		System.out.println("-----------------");
		
		
		star=1;
		space=n/2;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=space; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <=star; j++) {
				System.out.print("e ");
				Thread.sleep(100);
			}
			System.out.println();
			if(i<=n/2){
				star+=2;
				space--;
			}else{
				star-=2;
				space++;}}
		System.out.println("-----------------");

		star=n;
		space=0;
		for (int i =1; i <=n; i++) {
			for (int j =1; j <=space; j++) {
				System.out.print("  ");
			}
			for (int j =1; j <=star; j++) {
				System.out.print("e ");
				Thread.sleep(100);
			}
			System.out.println();
			
			if (i<=n/2) {
				star-=2;
				space++;
			}else {
				star+=2;
				space--;}}
		System.out.println("-----------------");
		
		star=1;
		space=n/2;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=space; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <=star; j++) {
				System.out.print("e ");
				Thread.sleep(100);
			}
			System.out.println();
			if(i<=n/2){
				star+=2;
				space--;
			}else{
				star-=2;
				space++;}}
		System.out.println("-----------------");
		
		}
		}
	}
