## Work in Progress

Add these layers:

  meta-openembedded/meta-oe  
  meta-raspberrypi  
  meta-rpi-gui  
  meta-openembedded/meta-python  
  meta-openembedded/meta-networking  

Available images:
- Implementing GUI using X11 and Tkinter (Python)
```
bitbake rpitkinter-image
```


## Future work
- Switch from X11 (xorg) to Wayland
- Implement GUI using Qt
- Control GPIO using C++ libraries