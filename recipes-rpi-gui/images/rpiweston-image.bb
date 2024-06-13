require recipes-graphics/images/core-image-weston.bb

IMAGE_INSTALL += " libstdc++ mtd-utils"
IMAGE_INSTALL += " openssh openssl openssh-sftp-server"
IMAGE_INSTALL += " python3"
IMAGE_INSTALL += " python3-pip"
IMAGE_INSTALL += " rpi-gpio"
IMAGE_INSTALL += " nano"

IMAGE_INSTALL += " rpi-gui-copy"
