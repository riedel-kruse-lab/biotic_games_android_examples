LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := OpenCVLibrary-2.4.9
LOCAL_SRC_FILES := \
	/Users/dchiu/Developer/riedel-kruse_lab/BioticGamesAndroidExamples/opencv/src/main/jni/Android.mk \
	/Users/dchiu/Developer/riedel-kruse_lab/BioticGamesAndroidExamples/opencv/src/main/jni/OpenCVLibrary-2.4.9.cpp \

LOCAL_C_INCLUDES += /Users/dchiu/Developer/riedel-kruse_lab/BioticGamesAndroidExamples/opencv/src/main/jni
LOCAL_C_INCLUDES += /Users/dchiu/Developer/riedel-kruse_lab/BioticGamesAndroidExamples/opencv/src/release/jni

include $(BUILD_SHARED_LIBRARY)
