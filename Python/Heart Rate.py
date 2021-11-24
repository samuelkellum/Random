import time

maxHRyn = input("Do you know your max heart rate? Y/N ")

if maxHRyn == 'Yes' or maxHRyn == 'Y' or maxHRyn == 'yes' or maxHRyn == 'y':
    maxHR = eval(input("What is your max heart rate? "))
else:
    print ("Okay then, we can approximate your max heart rate using your age.")
    time.sleep(0.5)
    age = eval(input("What is your age? "))
    maxHR = 220 - age
    print (("Your estimated max heart rate is: %d") % maxHR)

resting = eval(input("What is your resting heart rate? "))
percentage = eval(input("What percent of max heart rate are you trying to calculate? "))
heartrate = (((maxHR - resting)*(percentage/100))+resting)
time.sleep(1)
print ("PROCESSING...")
time.sleep(2)
print (("Your heart rate at %d percent of max is %d BPM") % (percentage, heartrate))
