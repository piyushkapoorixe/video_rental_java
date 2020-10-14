import java.util.Scanner;
public class VideoLauncher
{
	public static void main(String... args)
	{
		Scanner sc=new Scanner(System.in);
		VideoStore videoStore=new VideoStore();
		int choice;
		do
		{
			System.out.println("MAIN MENU");
			System.out.println("=========");
			System.out.println("1.Add Videos:");
			System.out.println("2.Check Out Video:");
			System.out.println("3.Return Video:");
			System.out.println("4.Receive Video:");
			System.out.println("5.List Inventory:");
			System.out.println("6.Exit:");
			System.out.println("Enter your choice (1..6):");
			
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter the name of the video you want to add: ");
					videoStore.addVideo(sc.next());
					break;
				case 2:
					System.out.println("Enter the name of the video you want to checkout: ");
					videoStore.doCheckout(sc.next());
					break;
				case 3:
					System.out.println("Enter the name of the video you want to return: ");
					videoStore.doReturn(sc.next());
					break;
				case 4:
					
					System.out.println("Enter the name of the video you want to rate: ");
					String x=sc.next();
					
					System.out.println("Enter the rating for this video: ");
					int y=sc.nextInt();
					
					videoStore.receiveRating(x,y);
					break;
				case 5:
					videoStore.listInventory();
					break;
				case 6:
					System.out.println("Exiting...!! Thanks for using the application.");
					System.exit(0);
			}
		}while(choice!=6);
	}
}