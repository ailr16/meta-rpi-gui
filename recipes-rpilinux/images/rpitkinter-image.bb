require recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += " libstdc++ mtd-utils"
IMAGE_INSTALL += " openssh openssl openssh-sftp-server"
IMAGE_INSTALL += " python3"
IMAGE_INSTALL += " python3-pip"
IMAGE_INSTALL += " rpi-gpio"
IMAGE_INSTALL += " nano"


IMAGE_INSTALL += " libinput"
IMAGE_INSTALL += " evtest"
IMAGE_INSTALL += " rpilinux-copy"
IMAGE_INSTALL += " rpilinux-service"
