package castle;

import java.util.HashMap;
import java.util.Scanner;


public class Game {
    private Room currentRoom;
    private HashMap<String , Handler> handlers = new HashMap<String, Handler>();
        
    public Game() 
    {
    	handlers.put("go", new HandlerGo(this));
    	handlers.put("bye", new HandlerBye(this));
    	handlers.put("help", new HandlerHelp(this));
        createRooms();
    }

    private void createRooms()
    {
        Room outside, lobby, pub, study, bedroom;
      
        //	制造房间
        outside = new Room("城堡外");
        lobby = new Room("大堂");
        pub = new Room("小酒吧");
        study = new Room("书房");
        bedroom = new Room("卧室");
        
        //	初始化房间的出口
//        outside.setExits(null, lobby, study, pub);
//        lobby.setExits(null, null, null, outside);
//        pub.setExits(null, outside, null, null);
//        study.setExits(outside, bedroom, null, null);
//        bedroom.setExits(null, null, null, study);
        outside.setExit("east", lobby);
        outside.setExit("south", study);
        outside.setExit("west", pub);
        lobby.setExit("west", outside);
        pub.setExit("east", outside);
        study.setExit("north", outside);
        study.setExit("east", bedroom);
        bedroom.setExit("west", study);
        lobby.setExit("up",pub);
        pub.setExit("down", lobby);
        currentRoom = outside;  //	4从城堡门外开始
    }

    private void printWelcome() {     //2
        System.out.println();
        System.out.println("欢迎来到城堡！");
        System.out.println("这是一个超级无聊的游戏。");
        System.out.println("如果需要帮助，请输入 'help' 。");
        System.out.println();
        ShowPrompt();
    }
    
    public void ShowPrompt(){    //3
    	System.out.println("现在你在" + currentRoom); //4current用到了tostring方法
    	System.out.print("出口有：");
        System.out.print(currentRoom.getExitDesc());   //5输出下一个有房间的方向
        System.out.println();
    }
    // 以下为用户命令
    public void play(){
    	Scanner in = new Scanner(System.in);
    	 while ( true ) {
     		String line = in.nextLine();
     		String[] words = line.split(" ");
     		Handler handler = handlers.get(words[0]);
     		String value = "";
     		if(words.length>1){
     			value = words[1];
     		}
     		if(handler != null){
     			handler.doCmd(value);
     			if(handler.isBye())
     				break;
     		}
     		
//     		if ( words[0].equals("help") ) {
//     			game.printHelp();
//     		} else if (words[0].equals("go") ) {
//     			game.goRoom(words[1]);
//     		} else if ( words[0].equals("bye") ) {
//     			break;
//     		}
    	 }
    	 in.close();
    }
    	
//    private void printHelp() 
//    {
//        System.out.print("迷路了吗？你可以做的命令有：go bye help");
//        System.out.println("如：\tgo east");
//    }

    public void goRoom(String direction)  //6
    {
        Room nextRoom = currentRoom.getExit(direction);  //7在main函数输入下一个方向后，判断现在房间的下一个房间
        
        if (nextRoom == null) {
            System.out.println("那里没有门！");
        }
        else {
            currentRoom = nextRoom;   //8将下一个房间赋给现在房间再继续执行
            ShowPrompt();          //9一轮循环结束
        }
    }
	
	public static void main(String[] args) {
		
		Game game = new Game();
		game.printWelcome();      //1
        game.play();
       
        
        
        System.out.println("感谢您的光临。再见！");
        
	}

}
