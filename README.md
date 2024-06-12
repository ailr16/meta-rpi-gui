## Work in Progress

Add these layers:

  meta-openembedded/meta-oe  
  meta-raspberrypi  
  meta-rpi-tkinter-image  
  meta-openembedded/meta-python  
  meta-openembedded/meta-networking  

Until this day, build the image using:
```
bitbake rpitkinter-image
```

NOTE: This recipe's name will change in the future, but it will be documented here


## Future work
- Implement GUI using Qt
- Control GPIO using C++ libraries