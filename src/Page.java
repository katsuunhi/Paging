import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Page {
	public static int time;
	public static boolean isAuto = true;
//public static void OPT(FinalFrame frame, int data[],int sleepTime) throws InterruptedException
//	{
//		int disk[] = new int[3];
//		int dataNum = 0;
//		int diskNum = 0;
//		int replaceCount = 0;
//		int lastDisk[] = new int[3];
//		int lostPageNum = 0;
//		for(int i = 20; i < 120; i ++)
//		{
//			frame.getChart().getPanel().getButtons(-1, i).setBackground(Color.WHITE);
//			frame.getChart().getPanel().getButtons(-1, i).setText("");
//		}
//		
//		while(dataNum < data.length)
//		{
//			Thread.sleep(1000);
//			boolean isFind = false;
//			boolean isContinue = false;
//			int replaceNum = 0;
//			int notReplaceCount = 0;
//			boolean isReplace[] = {true, true, true};
//			if(diskNum != 3)
//			{
//				disk[diskNum] = data[dataNum];
//				frame.getChart().getPanel().getButtons(diskNum, dataNum).setText("" + data[dataNum]);
//				frame.getChart().getPanel().getButtons(diskNum, dataNum).setBackground(Color.GREEN);
//				frame.getChart().getPanel().getButtons(3, dataNum).setBackground(Color.YELLOW);
//				lostPageNum ++;
//				lastDisk[diskNum] = dataNum;
//				diskNum ++;
//				dataNum ++;
//				continue;
//			}
//			for(int j = 0; j < 3; j ++)
//			{
//				if(data[dataNum] == disk[j])
//				{
//					dataNum ++;
//					isContinue = true;
//				}
//			}
//			if(isContinue)
//				continue;
//			for(int i = dataNum + 1; i < data.length; i ++)
//			{
//				for(int j = 0; j < 3; j ++)
//				{
//					if(data[i] == disk[j])
//						if(isReplace[j] == true && notReplaceCount != 2)
//						{
//							isReplace[j] = false;
//							notReplaceCount ++;
//						}
//						if(isReplace[j] == true && notReplaceCount == 2)
//						{
//							replaceNum = j;
//							isFind = true;
//						}	
//				}
//				if(isFind)
//					break;
//			}
//			frame.getChart().getPanel().getButtons(diskNum + 1, dataNum).setText("" + disk[replaceNum]);
//			disk[replaceNum] = data[dataNum];
//			frame.getChart().getPanel().getButtons(replaceNum, lastDisk[replaceNum]).setBackground(Color.RED);
//			frame.getChart().getPanel().getButtons(replaceNum, lastDisk[replaceNum]).setText("");
//			frame.getChart().getPanel().getButtons(replaceNum, dataNum).setBackground(Color.GREEN); 
//			frame.getChart().getPanel().getButtons(replaceNum, dataNum).setText("" + disk[replaceNum]);
//			frame.getChart().getPanel().getButtons(diskNum, dataNum).setBackground(Color.YELLOW);
//			lostPageNum ++;
//			lastDisk[replaceNum] = dataNum;
//			replaceCount ++;
//			dataNum ++;
//		}
//	}
//	
//	
//	public static void FIFO(FinalFrame frame, int data[], int sleepTime) throws InterruptedException
//	{
//		
//		int disk[] = new int[3];
//		int dataNum = 0;
//		int diskNum = 0;
//		int lastDisk[] = new int[3];
//		int lostPageNum = 0;
//		int replaceCount = 0;
//		int replaceNum = 0;
//		for(int i = 20; i < 120; i ++)
//		{
//			frame.getChart().getPanel().getButtons(-1, i).setBackground(Color.WHITE);
//			frame.getChart().getPanel().getButtons(-1, i).setText("");
//		}
//		while(dataNum < data.length)
//		{
//			Thread.sleep(1000);
//			if(dataNum < 3)
//			{
//				disk[diskNum] = data[dataNum];
//				lostPageNum ++;
//				frame.getChart().getPanel().getButtons(diskNum, dataNum).setText("" + disk[diskNum]);
//				frame.getChart().getPanel().getButtons(diskNum, dataNum).setBackground(Color.GREEN);
//				frame.getChart().getPanel().getButtons(3, dataNum).setBackground(Color.YELLOW);
//				lastDisk[diskNum] = dataNum;
//				diskNum ++;
//				dataNum ++;
//				continue;
//			}
//			else
//			{
//				boolean isReplace = true;
//				for(int i = 0; i < 3; i ++)
//					if(data[dataNum] == disk[i])
//					{
//						isReplace = false;
//					}
//				if(!isReplace)
//				{
//					dataNum ++;
//					continue;
//				}
//				else 
//				{	if(diskNum == 3)
//						diskNum = 0;
//					frame.getChart().getPanel().getButtons(4, dataNum).setText("" + disk[diskNum]);
//					disk[diskNum] = data[dataNum];
//					frame.getChart().getPanel().getButtons(diskNum, lastDisk[diskNum]).setBackground(Color.RED);
//					frame.getChart().getPanel().getButtons(diskNum, lastDisk[diskNum]).setText("");
//					frame.getChart().getPanel().getButtons(diskNum, dataNum).setText("" + disk[diskNum]);
//					frame.getChart().getPanel().getButtons(diskNum, dataNum).setBackground(Color.GREEN);
//					frame.getChart().getPanel().getButtons(3, dataNum).setBackground(Color.YELLOW);
//					replaceNum ++;
//					lostPageNum ++;
//					replaceNum = diskNum;
//					lastDisk[replaceNum] = dataNum;
//					diskNum ++;
//					dataNum ++;
//				}
//			}
//		} 
//	}
//	
//	
//	
//	public static void LRU(FinalFrame frame, int data[], int sleepTime) throws InterruptedException
//	{
//		int disk[] = new int[3];
//		int dataNum = 0;
//		int diskNum = 0;
//		int lastDisk[] = new int[3];
//		int replaceCount = 0;
//		int lostPageNum = 0;
//		for(int i = 20; i < 120; i ++)
//		{
//			frame.getChart().getPanel().getButtons(-1, i).setBackground(Color.WHITE);
//			frame.getChart().getPanel().getButtons(-1, i).setText("");
//		}
//		while(dataNum < data.length)
//		{
//			Thread.sleep(1000);
//			boolean isFind = false;
//			boolean isContinue = false;
//			int replaceNum = 0;
//			int notReplaceCount = 0;
//			boolean isReplace[] = {true, true, true};
//			if(diskNum != 3)
//			{
//				disk[diskNum] = data[dataNum];
//				lastDisk[diskNum] = dataNum;
//				lostPageNum ++;
//				frame.getChart().getPanel().getButtons(diskNum, dataNum).setText("" + disk[diskNum]);
//				frame.getChart().getPanel().getButtons(diskNum, dataNum).setBackground(Color.GREEN);
//				frame.getChart().getPanel().getButtons(3, dataNum).setBackground(Color.YELLOW);
//				diskNum ++;
//				dataNum ++;
//				continue;
//			}
//			for(int j = 0; j < 3; j ++)
//			{
//				if(data[dataNum] == disk[j])
//				{
//					isContinue = true;
//				}
//			}
//			if(isContinue)
//			{
//				dataNum ++;
//				continue;
//			}
//			for(int i = dataNum - 1; i >= 0; i --)
//			{
//				for(int j = 0; j < 3; j ++)
//				{
//					if(data[i] == disk[j])
//						if(isReplace[j] == true && notReplaceCount != 2)
//						{
//							isReplace[j] = false;
//							notReplaceCount ++;
//						}
//						if(isReplace[j] == true && notReplaceCount == 2)
//						{
//							replaceNum = j;
//							isFind = true;
//						}	
//				}
//				if(isFind)
//					break;
//			}
//			frame.getChart().getPanel().getButtons(diskNum + 1, dataNum).setText("" + disk[replaceNum]);
//			disk[replaceNum] = data[dataNum];
//			lostPageNum ++;
//			
//			frame.getChart().getPanel().getButtons(replaceNum, lastDisk[replaceNum]).setBackground(Color.RED);
//			frame.getChart().getPanel().getButtons(replaceNum, lastDisk[replaceNum]).setText("");
//			lastDisk[replaceNum] = dataNum;
//			
//			frame.getChart().getPanel().getButtons(replaceNum, dataNum).setBackground(Color.GREEN);
//			frame.getChart().getPanel().getButtons(replaceNum, dataNum).setText("" + disk[replaceNum]);
//			frame.getChart().getPanel().getButtons(3, dataNum).setBackground(Color.YELLOW);
//			replaceCount ++;
//			dataNum ++;
//		}
//	}
	public static void main(String [] arge) throws InterruptedException
	{
		FinalFrame frame = new FinalFrame();
		int data[] = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2, 1, 2, 0, 1, 7, 0, 1};
		JFrame frame1 = new JFrame();
		JPanel panel = new JPanel();
		JButton nextButton = new JButton("next");
		panel.add(nextButton);
		frame1.add(panel);
		while(true)
		{
			String selected = frame.getSelectButton().getSelected();
			frame.getCenterText().setLabelText(selected + " is being operated...");
			if(selected == "FIFO")     //FIFO算法
			{
				int disk[] = new int[3];
				int dataNum = 0;
				int diskNum = 0;
				int lastDisk[] = new int[3];
				int lostPageNum = 0;
				int replaceCount = 0;
				int replaceNum = 0;
				for(int i = 20; i < 120; i ++)
				{
					frame.getChart().getPanel().getButtons(-1, i).setBackground(Color.WHITE);
					frame.getChart().getPanel().getButtons(-1, i).setText("");
				}
				while(dataNum < data.length)
				{
					if(!isAuto)
					{
						time = 1;
						Thread.sleep(1000);
						if(time == 1)
							continue;
					}
					if(isAuto)				//延时，用来获取单击命令
					{
						Thread.sleep(1000);
					}
					if(dataNum < 3)
					{
						disk[diskNum] = data[dataNum];
						lostPageNum ++;
						frame.getChart().getPanel().getButtons(diskNum, dataNum).setText("" + disk[diskNum]);
						frame.getChart().getPanel().getButtons(diskNum, dataNum).setBackground(Color.GREEN);
						frame.getChart().getPanel().getButtons(3, dataNum).setBackground(Color.YELLOW);
						lastDisk[diskNum] = dataNum;
						diskNum ++;
						dataNum ++;
						continue;
					}
					else
					{
						boolean isReplace = true;
						for(int i = 0; i < 3; i ++)
							if(data[dataNum] == disk[i])
							{
								isReplace = false;
							}
						if(!isReplace)
						{
							dataNum ++;
							continue;
						}
						else 
						{	if(diskNum == 3)
								diskNum = 0;
							frame.getChart().getPanel().getButtons(4, dataNum).setText("" + disk[diskNum]);
							disk[diskNum] = data[dataNum];
							frame.getChart().getPanel().getButtons(diskNum, lastDisk[diskNum]).setBackground(Color.RED);
							frame.getChart().getPanel().getButtons(diskNum, lastDisk[diskNum]).setText("");
							frame.getChart().getPanel().getButtons(diskNum, dataNum).setText("" + disk[diskNum]);
							frame.getChart().getPanel().getButtons(diskNum, dataNum).setBackground(Color.GREEN);
							frame.getChart().getPanel().getButtons(3, dataNum).setBackground(Color.YELLOW);
							replaceNum ++;
							lostPageNum ++;
							replaceNum = diskNum;
							lastDisk[replaceNum] = dataNum;
							diskNum ++;
							dataNum ++;
						}
					}
				} 
			}
			if(selected == "LRU")
//				LRU(frame, data, 1000000);
			{
				int disk[] = new int[3];
				int dataNum = 0;
				int diskNum = 0;
				int lastDisk[] = new int[3];
				int replaceCount = 0;
				int lostPageNum = 0;
				for(int i = 20; i < 120; i ++)
				{
					frame.getChart().getPanel().getButtons(-1, i).setBackground(Color.WHITE);
					frame.getChart().getPanel().getButtons(-1, i).setText("");
				}
				while(dataNum < data.length)
				{
					if(!isAuto)
					{
						time = 1;
						Thread.sleep(1000);
						if(time == 1)
							continue;
					}
					if(isAuto)
					{
						Thread.sleep(1000);
					}
					boolean isFind = false;
					boolean isContinue = false;
					int replaceNum = 0;
					int notReplaceCount = 0;
					boolean isReplace[] = {true, true, true};
					if(diskNum != 3)
					{
						disk[diskNum] = data[dataNum];
						lastDisk[diskNum] = dataNum;
						lostPageNum ++;
						frame.getChart().getPanel().getButtons(diskNum, dataNum).setText("" + disk[diskNum]);
						frame.getChart().getPanel().getButtons(diskNum, dataNum).setBackground(Color.GREEN);
						frame.getChart().getPanel().getButtons(3, dataNum).setBackground(Color.YELLOW);
						diskNum ++;
						dataNum ++;
						continue;
					}
					for(int j = 0; j < 3; j ++)
					{
						if(data[dataNum] == disk[j])
						{
							isContinue = true;
						}
					}
					if(isContinue)
					{
						dataNum ++;
						continue;
					}
					for(int i = dataNum - 1; i >= 0; i --)
					{
						for(int j = 0; j < 3; j ++)
						{
							if(data[i] == disk[j])
								if(isReplace[j] == true && notReplaceCount != 2)
								{
									isReplace[j] = false;
									notReplaceCount ++;
								}
								if(isReplace[j] == true && notReplaceCount == 2)
								{
									replaceNum = j;
									isFind = true;
								}	
						}
						if(isFind)
							break;
					}
					frame.getChart().getPanel().getButtons(diskNum + 1, dataNum).setText("" + disk[replaceNum]);
					disk[replaceNum] = data[dataNum];
					lostPageNum ++;
					
					frame.getChart().getPanel().getButtons(replaceNum, lastDisk[replaceNum]).setBackground(Color.RED);
					frame.getChart().getPanel().getButtons(replaceNum, lastDisk[replaceNum]).setText("");
					lastDisk[replaceNum] = dataNum;
					
					frame.getChart().getPanel().getButtons(replaceNum, dataNum).setBackground(Color.GREEN);
					frame.getChart().getPanel().getButtons(replaceNum, dataNum).setText("" + disk[replaceNum]);
					frame.getChart().getPanel().getButtons(3, dataNum).setBackground(Color.YELLOW);
					replaceCount ++;
					dataNum ++;
				}
			}
			if(selected == "OPT")
//				OPT(frame, data, 1000000);
			{
				int disk[] = new int[3];
				int dataNum = 0;
				int diskNum = 0;
				int replaceCount = 0;
				int lastDisk[] = new int[3];
				int lostPageNum = 0;
				for(int i = 20; i < 120; i ++)
				{
					frame.getChart().getPanel().getButtons(-1, i).setBackground(Color.WHITE);
					frame.getChart().getPanel().getButtons(-1, i).setText("");
				}
				
				while(dataNum < data.length)
				{
					if(!isAuto)
					{
						time = 1;
						Thread.sleep(1000);
						if(time == 1)
							continue;
					}
					if(isAuto)
					{
						Thread.sleep(1000);
					}
					boolean isFind = false;
					boolean isContinue = false;
					int replaceNum = 0;
					int notReplaceCount = 0;
					boolean isReplace[] = {true, true, true};
					if(diskNum != 3)
					{
						disk[diskNum] = data[dataNum];
						frame.getChart().getPanel().getButtons(diskNum, dataNum).setText("" + data[dataNum]);
						frame.getChart().getPanel().getButtons(diskNum, dataNum).setBackground(Color.GREEN);
						frame.getChart().getPanel().getButtons(3, dataNum).setBackground(Color.YELLOW);
						lostPageNum ++;
						lastDisk[diskNum] = dataNum;
						diskNum ++;
						dataNum ++;
						continue;
					}
					for(int j = 0; j < 3; j ++)
					{
						if(data[dataNum] == disk[j])
						{
							dataNum ++;
							isContinue = true;
						}
					}
					if(isContinue)
						continue;
					for(int i = dataNum + 1; i < data.length; i ++)
					{
						for(int j = 0; j < 3; j ++)
						{
							if(data[i] == disk[j])
								if(isReplace[j] == true && notReplaceCount != 2)
								{
									isReplace[j] = false;
									notReplaceCount ++;
								}
								if(isReplace[j] == true && notReplaceCount == 2)
								{
									replaceNum = j;
									isFind = true;
								}	
						}
						if(isFind)
							break;
					}
					frame.getChart().getPanel().getButtons(diskNum + 1, dataNum).setText("" + disk[replaceNum]);
					disk[replaceNum] = data[dataNum];
					frame.getChart().getPanel().getButtons(replaceNum, lastDisk[replaceNum]).setBackground(Color.RED);
					frame.getChart().getPanel().getButtons(replaceNum, lastDisk[replaceNum]).setText("");
					frame.getChart().getPanel().getButtons(replaceNum, dataNum).setBackground(Color.GREEN); 
					frame.getChart().getPanel().getButtons(replaceNum, dataNum).setText("" + disk[replaceNum]);
					frame.getChart().getPanel().getButtons(diskNum, dataNum).setBackground(Color.YELLOW);
					lostPageNum ++;
					lastDisk[replaceNum] = dataNum;
					replaceCount ++;
					dataNum ++;
					
				}
			}
			
		}
		
		
	}
	
}
