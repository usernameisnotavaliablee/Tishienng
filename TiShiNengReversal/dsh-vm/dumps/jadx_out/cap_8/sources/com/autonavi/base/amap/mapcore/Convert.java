package com.autonavi.base.amap.mapcore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Convert {
    public Convert() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final java.lang.String bytesToHexString(byte[] r6) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            int r1 = r6.length
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L8:
            int r3 = r6.length
            if (r2 >= r3) goto L27
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            int r4 = r3.length()
            r5 = 2
            if (r4 >= r5) goto L1d
            r0.append(r1)
        L1d:
            java.lang.String r3 = r3.toUpperCase()
            r0.append(r3)
            int r2 = r2 + 1
            goto L8
        L27:
            java.lang.String r6 = r0.toString()
            return r6
    }

    public static void convert1bString(byte[] r3, int r4, com.autonavi.base.amap.mapcore.ConvertString r5) {
            r0 = r3[r4]     // Catch: java.lang.Exception -> L10
            r5.byteLength = r0     // Catch: java.lang.Exception -> L10
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L10
            int r4 = r4 + 1
            java.lang.String r2 = "UTF-8"
            r1.<init>(r3, r4, r0, r2)     // Catch: java.lang.Exception -> L10
            r5.value = r1     // Catch: java.lang.Exception -> L10
            return
        L10:
            r3 = 0
            r5.byteLength = r3
            java.lang.String r3 = ""
            r5.value = r3
            return
    }

    public static void convert2bString(byte[] r3, int r4, com.autonavi.base.amap.mapcore.ConvertString r5) {
            short r0 = getShort(r3, r4)     // Catch: java.lang.Exception -> L12
            r5.byteLength = r0     // Catch: java.lang.Exception -> L12
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L12
            int r4 = r4 + 2
            java.lang.String r2 = "UTF-8"
            r1.<init>(r3, r4, r0, r2)     // Catch: java.lang.Exception -> L12
            r5.value = r1     // Catch: java.lang.Exception -> L12
            return
        L12:
            r3 = 0
            r5.byteLength = r3
            java.lang.String r3 = ""
            r5.value = r3
            return
    }

    public static double convertDouble(byte[] r6, int r7) {
            r0 = 0
            r2 = 0
        L3:
            r3 = 8
            if (r2 >= r3) goto L15
            int r3 = r2 + r7
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            long r3 = (long) r3
            int r5 = r2 * 8
            long r3 = r3 << r5
            long r0 = r0 + r3
            int r2 = r2 + 1
            goto L3
        L15:
            double r6 = java.lang.Double.longBitsToDouble(r0)
            return r6
    }

    public static byte[] convertInt(int r5) {
            r0 = r5 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            int r1 = r5 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            int r2 = r5 >> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            int r5 = r5 >> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r3 = 4
            byte[] r3 = new byte[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r2
            r0 = 3
            r3[r0] = r5
            return r3
    }

    public static byte[] convertShort(int r3) {
            r0 = r3 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            int r3 = r3 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r1 = 2
            byte[] r1 = new byte[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r3
            return r1
    }

    public static byte[] copyString(byte[] r2, int r3, int r4) {
            byte[] r0 = new byte[r4]
            r1 = 0
            java.lang.System.arraycopy(r2, r3, r0, r1, r4)
            return r0
    }

    public static byte[] covertBytes(byte r2) {
            r0 = 1
            byte[] r0 = new byte[r0]
            r1 = 0
            r0[r1] = r2
            return r0
    }

    public static byte[] get1BString(java.lang.String r5) {
            r0 = 1
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L1e
            r1.<init>()     // Catch: java.lang.Exception -> L1e
            java.lang.String r2 = "UTF-8"
            byte[] r5 = r5.getBytes(r2)     // Catch: java.lang.Exception -> L1e
            int r2 = r5.length     // Catch: java.lang.Exception -> L1e
            byte r2 = (byte) r2     // Catch: java.lang.Exception -> L1e
            byte[] r3 = new byte[r0]     // Catch: java.lang.Exception -> L1e
            r4 = 0
            r3[r4] = r2     // Catch: java.lang.Exception -> L1e
            r1.write(r3)     // Catch: java.lang.Exception -> L1e
            r1.write(r5)     // Catch: java.lang.Exception -> L1e
            byte[] r5 = r1.toByteArray()     // Catch: java.lang.Exception -> L1e
            return r5
        L1e:
            byte[] r5 = new byte[r0]
            return r5
    }

    public static byte[] get2BString(java.lang.String r2) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L1b
            r0.<init>()     // Catch: java.lang.Exception -> L1b
            java.lang.String r1 = "UTF-8"
            byte[] r2 = r2.getBytes(r1)     // Catch: java.lang.Exception -> L1b
            int r1 = r2.length     // Catch: java.lang.Exception -> L1b
            byte[] r1 = convertShort(r1)     // Catch: java.lang.Exception -> L1b
            r0.write(r1)     // Catch: java.lang.Exception -> L1b
            r0.write(r2)     // Catch: java.lang.Exception -> L1b
            byte[] r2 = r0.toByteArray()     // Catch: java.lang.Exception -> L1b
            return r2
        L1b:
            r2 = 1
            byte[] r2 = new byte[r2]
            return r2
    }

    public static boolean getBit(byte r1, int r2) {
            int r0 = 32 - r2
            int r1 = r1 << r0
            int r1 = r1 >>> r0
            r0 = 1
            int r2 = r2 - r0
            int r1 = r1 >>> r2
            if (r1 <= 0) goto La
            return r0
        La:
            r1 = 0
            return r1
    }

    public static byte[] getDouble(double r5) {
            r0 = 8
            byte[] r1 = new byte[r0]
            long r5 = java.lang.Double.doubleToLongBits(r5)
            java.lang.String r5 = java.lang.Long.toHexString(r5)
            r6 = 0
        Ld:
            if (r6 >= r0) goto L25
            int r2 = r6 * 2
            int r3 = r2 + 2
            java.lang.String r2 = r5.substring(r2, r3)
            int r3 = 7 - r6
            r4 = 16
            int r2 = java.lang.Integer.parseInt(r2, r4)
            byte r2 = (byte) r2
            r1[r3] = r2
            int r6 = r6 + 1
            goto Ld
        L25:
            return r1
    }

    public static int getInt(byte[] r3, int r4) {
            int r0 = r4 + 3
            r0 = r3[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r4 + 2
            r1 = r3[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r4 + 1
            r2 = r3[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = r3[r4]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r0 << 24
            int r0 = r1 << 16
            int r4 = r4 + r0
            int r0 = r2 << 8
            int r4 = r4 + r0
            int r4 = r4 + r3
            return r4
    }

    public static int getNum(byte r0, int r1, int r2) {
            int r2 = 31 - r2
            int r0 = r0 << r2
            int r0 = r0 >>> r2
            int r0 = r0 >>> r1
            return r0
    }

    public static int getNum(short r0, int r1, int r2) {
            int r2 = 32 - r2
            int r0 = r0 << r2
            int r0 = r0 >>> r2
            int r1 = r1 + (-1)
            int r0 = r0 >>> r1
            return r0
    }

    public static short getShort(byte[] r1, int r2) {
            int r0 = r2 + 1
            r0 = r1[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r0 << 8
            int r2 = r2 + r1
            short r1 = (short) r2
            return r1
    }

    public static java.lang.String getString(byte[] r2, int r3, int r4) {
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L8
            java.lang.String r1 = "UTF-8"
            r0.<init>(r2, r3, r4, r1)     // Catch: java.lang.Exception -> L8
            return r0
        L8:
            java.lang.String r2 = ""
            return r2
    }

    public static byte[] getSubBytes(byte[] r2, int r3, int r4) {
            byte[] r0 = new byte[r4]
            r1 = 0
            java.lang.System.arraycopy(r2, r3, r0, r1, r4)
            return r0
    }

    public static int getUShort(byte[] r1, int r2) {
            int r0 = r2 + 1
            r0 = r1[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r0 << 8
            int r2 = r2 + r1
            return r2
    }

    public static void moveArray(byte[] r2, int r3, byte[] r4, int r5, int r6) {
            byte[] r0 = new byte[r6]
            r1 = 0
            java.lang.System.arraycopy(r2, r3, r0, r1, r6)
            java.lang.System.arraycopy(r0, r1, r4, r5, r6)
            return
    }

    public static void writeInt(byte[] r2, int r3, int r4) {
            byte[] r4 = convertInt(r4)
            r0 = 0
            r1 = 4
            java.lang.System.arraycopy(r4, r0, r2, r3, r1)
            return
    }

    public static void writeShort(byte[] r2, int r3, short r4) {
            byte[] r4 = convertShort(r4)
            r0 = 0
            r1 = 2
            java.lang.System.arraycopy(r4, r0, r2, r3, r1)
            return
    }
}
