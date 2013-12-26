import matplotlib.pyplot as plt
import time
import datetime
import numpy as np
import matplotlib.ticker as mticker
import matplotlib.dates as mdates

eachStock ='test1',''

def graphData(stock):
    try:
        stockFile = stock+'.txt'
        pro, price = np.loadtxt(stockFile,delimiter =',',unpack=True,converters={})
        fig = plt.figure()
        ax1 = plt.subplot(1,1,1)
        
        ax1.bar(pro,price)
        
        plt.xlabel('pro', fontsize=2)
        plt.ylabel('price')
        #plt.yticks([i for i in price], fontsize=8)
        plt.xticks([i for i in pro], rotation='vertical', fontsize=8)
        plt.show()

    except Exception as e:
        print ('failed', str(e))

for stock in eachStock:
    graphData(stock)
    time.sleep(555)
