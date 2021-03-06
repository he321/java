package genetics1;

import java.io.Serializable;

public class CopyOfData implements Serializable{
	//车间需要的数据
	public  double wsLength = 10;
	public  double wsWidth = 8;
	public  int wsEquCount = 10;			//设备的数量
	public  double wsRowWidth = 2; 		//车间中存放设备时每行设备的宽度
	public  double wsFirstMargin = 1.5;	//第一行设备距离墙的宽度
//	public   double wsT = 500;				//500
	
	
	//设备需要的数据
	//***************************************************
	public   double[] equLength = 
			new double[]{1.2, 0.5, 1.7, 0.7, 1.0, 0.8, 0.5, 1.4, 0.8, 1.2};
	public   double[] equWidth = 
			new double[]{1.0, 0.4, 0.8, 0.7, 0.8, 0.8, 0.8, 0.8, 0.8, 0.6};
	public   double[] equWallMargin = 
			new double[]{1.0, 2.0, 1.5, 1.5, 1.3, 1.2, 1 , 1.8, 2, 1};
	public   double[] cost = 
			new double[]{120, 50, 160, 40, 90, 60, 40, 100, 70, 60};
	
	
	//设备间关系需要的数据
	//***************************************************
	public   double[][] equMargin = 
			new double[][]{ {0.0, 1.0, 1.8, 1.8, 1.2, 1.4, 2.0, 1.3, 1.2, 1.0},
							{1.0, 0.0, 2.0, 2.0, 1.0, 1.5, 1.7, 1.6, 1.5, 1.0},
							{1.8, 2.0, 0.0, 1.0, 1.0, 2.0, 1.0, 1.5, 1.3, 1.0},
							{1.8, 2.0, 1.0, 0.0, 1.0, 2.0, 1.8, 1.8, 1.0, 1.0},
							{1.2, 1.0, 1.0, 1.0, 0.0, 1.7, 1.0, 1.7, 2.0, 1.0},
							{1.4, 1.5, 2.0, 2.0, 1.7, 0.0, 2.0, 1.0, 1.0, 1.0},
							{2.0, 1.7, 1.0, 1.8, 1.0, 2.0, 0.0, 1.2, 1.0, 1.0},
							{1.3, 1.6, 1.5, 1.8, 1.7, 1.0, 1.2, 0.0, 1.8, 1.0},
							{1.2, 1.5, 1.3, 1.0, 2.0, 1.0, 1.0, 1.8, 0.0, 1.0},
							{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0}};
	public   double[][] P = 
			new double[][]{ {0.0, 0.5, 0.2, 0.3, 0.3, 0.5, 0.3, 0.4, 0.3, 0.5},
							{0.5, 0.0, 0.6, 0.5, 0.5, 0.4, 0.3, 0.4, 0.2, 0.5},
							{0.2, 0.6, 0.0, 0.4, 0.3, 0.2, 0.6, 0.2, 0.3, 0.6},
							{0.3, 0.5, 0.4, 0.0, 0.5, 0.4, 0.2, 0.3, 0.2, 0.5},
							{0.3, 0.5, 0.3, 0.5, 0.0, 0.5, 0.5, 0.6, 0.4, 0.3},
							{0.5, 0.4, 0.2, 0.4, 0.5, 0.0, 0.5, 0.3, 0.3, 0.2},
							{0.3, 0.3, 0.6, 0.2, 0.2, 0.5, 0.0, 0.5, 0.4, 0.4},
							{0.4, 0.4, 0.2, 0.3, 0.6, 0.3, 0.5, 0.0, 0.3, 0.2},
							{0.3, 0.2, 0.3, 0.2, 0.4, 0.3, 0.4, 0.3, 0.0, 0.2},
							{0.5, 0.5, 0.6, 0.5, 0.3, 0.2, 0.4, 0.2, 0.2, 0.0}};
	public   double[][] Q1 = 
			new double[][]{ {0, 330, 200, 0,   0,  0,  0,  0,  0,  0  },
							{0, 0,   0,   240, 90, 0,  0,  0,  0,  0  },
							{0, 0,   0,   150, 50, 0,  0,  0,  0,  0  },
							{0, 0,   0,   0,   230,100,0,  60, 0,  0  },
							{0, 0,   0,   0,   0,  370,0,  0,  0,  0  },
							{0, 0,   0,   0,   0,  0,  60, 410,0,  0  },
							{0, 0,   0,   0,   0,  0,  0,  0,  60, 0  },
							{0, 0,   0,   0,   0,  0,  0,  0,  470,0  },
							{0, 0,   0,   0,   0,  0,  0,  0,  0,  530},
							{0, 0,   0,   0,   0,  0,  0,  0,  0,  0  }};
	public   double[][] Q2 = 
			new double[][]{ {0, 0, 43, 0,   0,    0,   0,  0 ,  0,   0 },
							{0, 0, 0,  240, 0,    0,   0,  0,   0,   0 },
							{0, 0, 0,  250, 180,  0,   0,  0 ,  0,   0 },
							{0, 0, 0,  0,   490,  0,   0,  0 ,  0,   0 },
							{0, 0, 0,  0,   0,    670, 0,  0 ,  0,   0 },
							{0, 0, 0,  0,   0,    0,   200,370, 100, 0 },
							{0, 0, 0,  0,   0,    0,   0,  100, 100, 0 },
							{0, 0, 0,  0,   0,    0,   0,  0 ,  470, 0 },
							{0, 0, 0,  0,   0,    0,   0,  0 ,  0,   670},
							{0, 0, 0,  0,   0,    0,   0,  0 ,  0,   0}};
	
	public   double[][] Q3 = 
			new double[][]{ {0, 150,   50,  580,  0,   0,  0,   0,   0,  0  },
							{0,  0,    100, 50,   0,   0,  0,   0,   0,  0  },
							{0,  0,    0,   0,   150,  0,  0,   0,   0,  0  },
							{0,  0,    0,   0,   500,  130,0,   0,   0,  0  },
							{0,  0,    0,   0,   0,    510,140, 0,   0,  0  },
							{0,  0,    0,   0,   0,    0,  100, 540, 0,  0  },
							{0,  0,    0,   0,   0,    0,  0,   0,   240,0  },
							{0,  0,    0,   0,   0,    0,  0,   0,   0,  540},
							{0,  0,    0,   0,   0,    0,  0,   0,   0,  240},
							{0,  0,    0,   0,   0,    0,  0,   0,   0,  0  },};
	
	
	
	//种群需要用到的数据
	//***************************************************
	public   int producePeriod = 3;		//周期
	public   int indiCount = 50;			//个体数量（每期初始产生多少个1-8的编码）
	public   int screenCount = 100;		//选择变异的次数
	public   double variationRate = 1;		//变异概率
	
	//计算时需要用到的数据
	public   double b1 = 0.4;
	public   double b2 = 0.3;
	public   double b3 = 0.3;
	public   double TR = 500;				//设备重置时需要用到的TR
	public   double T = 500;				//罚函数
	
	//混沌迭代时需要用到的数据
	public   int resuleIteratorCount = 50;
	public   double u = 4;
	public   int m = 3;
}
