package cn.jiguang.api.utils;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ByteBufferUtils {
    public static final int ERROR_CODE = 10000;
    private static final java.lang.String TAG = "ByteBufferUtils";

    public ByteBufferUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String generalExtraStr(java.lang.Throwable r2, cn.jiguang.api.JResponse r3, java.nio.ByteBuffer r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r3 == 0) goto L2c
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "|bytebuffer:"
            r3.append(r1)
            if (r4 != 0) goto L1e
            java.lang.String r4 = "byteBuffer is null"
            goto L22
        L1e:
            java.lang.String r4 = r4.toString()
        L22:
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
        L2c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "byteBuffer info:"
            r3.append(r4)
            java.lang.String r4 = r0.toString()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "ByteBufferUtils"
            cn.jiguang.at.d.f(r4, r3)
            java.io.StringWriter r3 = new java.io.StringWriter     // Catch: java.lang.Exception -> L6b
            r3.<init>()     // Catch: java.lang.Exception -> L6b
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch: java.lang.Exception -> L6b
            r1.<init>(r3)     // Catch: java.lang.Exception -> L6b
            r2.getClass()     // Catch: java.lang.Exception -> L6b
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L6b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6b
            r3.<init>()     // Catch: java.lang.Exception -> L6b
            java.lang.String r1 = "parse data error stackTrace:"
            r3.append(r1)     // Catch: java.lang.Exception -> L6b
            r3.append(r2)     // Catch: java.lang.Exception -> L6b
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L6b
            cn.jiguang.at.d.f(r4, r2)     // Catch: java.lang.Exception -> L6b
        L6b:
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.Byte get(java.nio.ByteBuffer r1, cn.jiguang.api.JResponse r2) {
            byte r0 = r1.get()     // Catch: java.lang.Exception -> L9 java.nio.BufferOverflowException -> Lb java.nio.BufferUnderflowException -> Ld
            java.lang.Byte r1 = java.lang.Byte.valueOf(r0)     // Catch: java.lang.Exception -> L9 java.nio.BufferOverflowException -> Lb java.nio.BufferUnderflowException -> Ld
            return r1
        L9:
            r0 = move-exception
            goto Le
        Lb:
            r0 = move-exception
            goto Le
        Ld:
            r0 = move-exception
        Le:
            java.lang.Throwable r0 = r0.fillInStackTrace()
            onException(r0, r2, r1)
            if (r2 == 0) goto L1b
            r1 = 10000(0x2710, float:1.4013E-41)
            r2.code = r1
        L1b:
            r1 = 0
            return r1
    }

    public static java.nio.ByteBuffer get(java.nio.ByteBuffer r0, byte[] r1, cn.jiguang.api.JResponse r2) {
            java.nio.ByteBuffer r0 = r0.get(r1)     // Catch: java.lang.Exception -> L5 java.nio.BufferOverflowException -> Le java.nio.BufferUnderflowException -> L10
            return r0
        L5:
            r1 = move-exception
        L6:
            java.lang.Throwable r1 = r1.fillInStackTrace()
            onException(r1, r2, r0)
            goto L12
        Le:
            r1 = move-exception
            goto L6
        L10:
            r1 = move-exception
            goto L6
        L12:
            if (r2 == 0) goto L18
            r0 = 10000(0x2710, float:1.4013E-41)
            r2.code = r0
        L18:
            r0 = 0
            return r0
    }

    public static int getInt(java.nio.ByteBuffer r1, cn.jiguang.api.JResponse r2) {
            int r1 = r1.getInt()     // Catch: java.lang.Exception -> L5 java.nio.BufferOverflowException -> Le java.nio.BufferUnderflowException -> L10
            return r1
        L5:
            r0 = move-exception
        L6:
            java.lang.Throwable r0 = r0.fillInStackTrace()
            onException(r0, r2, r1)
            goto L12
        Le:
            r0 = move-exception
            goto L6
        L10:
            r0 = move-exception
            goto L6
        L12:
            if (r2 == 0) goto L18
            r1 = 10000(0x2710, float:1.4013E-41)
            r2.code = r1
        L18:
            r1 = -1
            return r1
    }

    public static long getLong(java.nio.ByteBuffer r1, cn.jiguang.api.JResponse r2) {
            long r1 = r1.getLong()     // Catch: java.lang.Exception -> L5 java.nio.BufferOverflowException -> Le java.nio.BufferUnderflowException -> L10
            return r1
        L5:
            r0 = move-exception
        L6:
            java.lang.Throwable r0 = r0.fillInStackTrace()
            onException(r0, r2, r1)
            goto L12
        Le:
            r0 = move-exception
            goto L6
        L10:
            r0 = move-exception
            goto L6
        L12:
            if (r2 == 0) goto L18
            r1 = 10000(0x2710, float:1.4013E-41)
            r2.code = r1
        L18:
            r1 = 0
            return r1
    }

    public static short getShort(java.nio.ByteBuffer r1, cn.jiguang.api.JResponse r2) {
            short r1 = r1.getShort()     // Catch: java.lang.Exception -> L5 java.nio.BufferOverflowException -> Le java.nio.BufferUnderflowException -> L10
            return r1
        L5:
            r0 = move-exception
        L6:
            java.lang.Throwable r0 = r0.fillInStackTrace()
            onException(r0, r2, r1)
            goto L12
        Le:
            r0 = move-exception
            goto L6
        L10:
            r0 = move-exception
            goto L6
        L12:
            if (r2 == 0) goto L18
            r1 = 10000(0x2710, float:1.4013E-41)
            r2.code = r1
        L18:
            r1 = -1
            return r1
    }

    private static void onException(java.lang.Throwable r0, cn.jiguang.api.JResponse r1, java.nio.ByteBuffer r2) {
            generalExtraStr(r0, r1, r2)
            return
    }
}
