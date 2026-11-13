package com.legendsayantan.adbtools.lib

import android.content.Context
import android.media.AudioDeviceInfo
import com.legendsayantan.adbtools.R

/**
 * @author legendsayantan
 */
class AudioOutputMap {

    companion object {
        fun getName(context: Context, type: Int) : String{
            return when (type) {
                AudioDeviceInfo.TYPE_BUILTIN_EARPIECE -> context.getString(R.string.out_earpiece)
                AudioDeviceInfo.TYPE_BUILTIN_SPEAKER -> context.getString(R.string.out_speaker)
                AudioDeviceInfo.TYPE_WIRED_HEADSET -> context.getString(R.string.out_headset)
                AudioDeviceInfo.TYPE_WIRED_HEADPHONES -> context.getString(R.string.out_headphones)
                AudioDeviceInfo.TYPE_LINE_ANALOG -> context.getString(R.string.out_analog)
                AudioDeviceInfo.TYPE_LINE_DIGITAL -> context.getString(R.string.out_digital)
                AudioDeviceInfo.TYPE_BLUETOOTH_SCO -> context.getString(R.string.out_bt_call)
                AudioDeviceInfo.TYPE_BLUETOOTH_A2DP -> context.getString(R.string.out_bt_audio)
                AudioDeviceInfo.TYPE_HDMI,AudioDeviceInfo.TYPE_HDMI_ARC -> context.getString(R.string.out_hdmi)
                AudioDeviceInfo.TYPE_USB_DEVICE,AudioDeviceInfo.TYPE_USB_ACCESSORY,AudioDeviceInfo.TYPE_USB_HEADSET -> context.getString(R.string.out_usb)
                AudioDeviceInfo.TYPE_DOCK, AudioDeviceInfo.TYPE_DOCK_ANALOG -> context.getString(R.string.out_dock)
                AudioDeviceInfo.TYPE_FM, AudioDeviceInfo.TYPE_FM_TUNER -> context.getString(R.string.out_fm)
                AudioDeviceInfo.TYPE_BUILTIN_MIC -> context.getString(R.string.out_mic)
                AudioDeviceInfo.TYPE_TV_TUNER -> context.getString(R.string.out_tv)
                AudioDeviceInfo.TYPE_TELEPHONY -> context.getString(R.string.out_tele)
                AudioDeviceInfo.TYPE_AUX_LINE -> context.getString(R.string.out_aux)
                AudioDeviceInfo.TYPE_IP -> context.getString(R.string.out_ip)
                AudioDeviceInfo.TYPE_BUS -> context.getString(R.string.out_bus)
                AudioDeviceInfo.TYPE_HEARING_AID -> context.getString(R.string.out_hearing_aid)
                AudioDeviceInfo.TYPE_REMOTE_SUBMIX -> context.getString(R.string.out_remote_submix)
                AudioDeviceInfo.TYPE_BLE_HEADSET, AudioDeviceInfo.TYPE_BLE_SPEAKER -> context.getString(R.string.out_ble)
                else -> context.getString(R.string.out_type, type)
            }
        }


    }
}