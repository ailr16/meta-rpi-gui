import RPi.GPIO as GPIO
import time
import tkinter

led_pin = 12

GPIO.setwarnings(False)
GPIO.setmode(GPIO.BOARD)
GPIO.setup(led_pin, GPIO.OUT)


def led_on():
    GPIO.output( led_pin, GPIO.HIGH )

def led_off():
    GPIO.output( led_pin, GPIO.LOW )

window = tkinter.Tk()
window.title("Basic HMI")

label = tkinter.Label(window, text="Basic HMI using Raspberry Pi 4 and Yocto image")
label.pack()

button_on = tkinter.Button(window, text="LED On", height=10, width=20, command = lambda: led_on())
button_off = tkinter.Button(window, text="LED Off", height=10, width=20, command = lambda: led_off())

button_on.pack()
button_off.pack()

window.mainloop()
