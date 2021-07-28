require qt5.inc
require qt5-git.inc

LICENSE = "GFDL-1.3 | The-Qt-Company-Commercial"
LIC_FILES_CHKSUM = " \
    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e \
"

DEPENDS += "qtdeclarative qtquickcontrols2 qtquickcontrols qtxmlpatterns"

SRCREV = "9debad60b88ffb51f50d111f9b4f871f5418622b"

PACKAGES += "${PN}-examples-good"
FILES_${PN}-examples-good = "\
    /usr/share/examples/demos/clocks \
    /usr/share/examples/demos/calqlatr \
"

FILES_${PN}-examples = "\
    /usr/share/examples/demos/demos.pro \
    /usr/share/examples/demos/tweetsearch \
    /usr/share/examples/demos/maroon \
    /usr/share/examples/demos/photosurface \
    /usr/share/examples/demos/samegame \
    /usr/share/examples/demos/stocqt \
    /usr/share/examples/demos/coffee \
    /usr/share/examples/demos/rssnews \
"
