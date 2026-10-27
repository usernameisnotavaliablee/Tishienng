package com.bykv.vk.component.ttvideo.player;

@com.bykv.vk.component.ttvideo.player.Keep
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AudioFormats {
    private static boolean sDetectDlbDevices;
    private static boolean sDlbDevice;
    private static final int[] validSampleRates = null;

    static {
            r0 = 20
            int[] r0 = new int[r0]
            r0 = {x0010: FILL_ARRAY_DATA , data: [4000, 8000, 11025, 16000, 22050, 32000, 37800, 44056, 44100, 47250, 48000, 50000, 50400, 88200, 96000, 176400, 192000, 352800, 2822400, 5644800} // fill-array
            com.bykv.vk.component.ttvideo.player.AudioFormats.validSampleRates = r0
            r0 = 0
            com.bykv.vk.component.ttvideo.player.AudioFormats.sDetectDlbDevices = r0
            com.bykv.vk.component.ttvideo.player.AudioFormats.sDlbDevice = r0
            return
    }

    public AudioFormats() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getDefaultSampleRatesNB() {
            int[] r0 = com.bykv.vk.component.ttvideo.player.AudioFormats.validSampleRates
            int r0 = r0.length
            return r0
    }

    public static int getMaxSupportedSampleRates(int[] r3) {
            int[] r0 = com.bykv.vk.component.ttvideo.player.AudioFormats.validSampleRates
            int r0 = r0.length
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto Lc
            int r0 = r0 + (-3)
            goto Le
        Lc:
            int r0 = r0 + (-5)
        Le:
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1a
            int[] r2 = com.bykv.vk.component.ttvideo.player.AudioFormats.validSampleRates
            r2 = r2[r1]
            r3[r1] = r2
            int r1 = r1 + 1
            goto Lf
        L1a:
            return r0
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public static boolean isLicencedDolbyDevice() {
            boolean r0 = com.bykv.vk.component.ttvideo.player.AudioFormats.sDetectDlbDevices
            if (r0 == 0) goto L7
            boolean r0 = com.bykv.vk.component.ttvideo.player.AudioFormats.sDlbDevice
            return r0
        L7:
            android.media.audiofx.AudioEffect$Descriptor[] r0 = android.media.audiofx.AudioEffect.queryEffects()
            int r1 = r0.length
            r2 = 0
        Ld:
            r3 = 1
            if (r2 >= r1) goto L22
            r4 = r0[r2]
            java.lang.String r4 = r4.implementor
            java.lang.String r5 = "Dolby Laboratories"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L1f
            com.bykv.vk.component.ttvideo.player.AudioFormats.sDlbDevice = r3
            goto L22
        L1f:
            int r2 = r2 + 1
            goto Ld
        L22:
            com.bykv.vk.component.ttvideo.player.AudioFormats.sDetectDlbDevices = r3
            boolean r0 = com.bykv.vk.component.ttvideo.player.AudioFormats.sDlbDevice
            return r0
    }
}
