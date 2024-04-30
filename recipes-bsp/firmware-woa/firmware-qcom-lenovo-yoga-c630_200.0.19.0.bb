DESCRIPTION = "Qualcomm Firmware for Lenovo Yoga C630 laptop"

LICENSE = "CLOSED"

FW_QCOM_SUBDIR = "sdm850/LENOVO/81JL"
FW_QCOM_NAME = "lenovo-yoga-c630"
WOA_SUBDIR = "Lenovo/YogaC630"

SRC_URI = "\
    ${WOA_FW_URL}/qcdx850.cab;name=dx \
    ${WOA_FW_URL}/qcipa850.cab;name=ipa \
    ${WOA_FW_URL}/qcsubsys850.cab;name=dsp \
    file://adspr.jsn \
    file://adspua.jsn \
    file://cdspr.jsn \
    file://slpir.jsn \
    file://slpius.jsn \
"

SRC_URI[dx.sha256sum] = "949f9fa256d036d829a1429451514c4f6aa3fcb228078a36a0bc4c6d569be3f9"
SRC_URI[ipa.sha256sum] = "544f0b2ff642846a2bf0754600be57ef8277c4ebd9dcf72b61cb3d1f463bfec8"
SRC_URI[dsp.sha256sum] = "23f8f1413ffdac6d6dfc7d0876f3cd5b840db70889d5f399e586e77ab91d89af"

SPLIT_FIRMWARE_PACKAGES = "\
    linux-firmware-qcom-${FW_QCOM_NAME}-adreno \
    linux-firmware-qcom-${FW_QCOM_NAME}-audio \
    linux-firmware-qcom-${FW_QCOM_NAME}-compute \
    linux-firmware-qcom-${FW_QCOM_NAME}-ipa \
    linux-firmware-qcom-${FW_QCOM_NAME}-modem \
    linux-firmware-qcom-${FW_QCOM_NAME}-sensors \
    linux-firmware-qcom-${FW_QCOM_NAME}-venus \
"

require firmware-woa.inc
