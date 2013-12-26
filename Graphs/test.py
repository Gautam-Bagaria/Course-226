import matplotlib.pyplot as plt
import time
import datetime
import numpy as np
import matplotlib.ticker as mticker
import matplotlib.dates as mdates

eachStock ='test'

def graphData(stock):
    try:
        stockFile = test+'.txt'
        date, pro, price = np.loadtxt(stockFile,delimiter =',',unpack=True,converters={0: mdates.stripdate2num('%Y-%m-%d')})
        fig = plt.figure()
        ax1 = plt.subplot(1,1,1)
        ax1.plot(date,pro)
        ax1.plot(date,price)
        plt.show()

    except Exception as e:
        print ('failed', str(e))

for stock in eachStock:
    graphData(stock)
    time.sleep(555)
