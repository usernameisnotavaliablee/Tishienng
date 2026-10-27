package com.alibaba.fastjson.asm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Type {
    public static final com.alibaba.fastjson.asm.Type BOOLEAN_TYPE = null;
    public static final com.alibaba.fastjson.asm.Type BYTE_TYPE = null;
    public static final com.alibaba.fastjson.asm.Type CHAR_TYPE = null;
    public static final com.alibaba.fastjson.asm.Type DOUBLE_TYPE = null;
    public static final com.alibaba.fastjson.asm.Type FLOAT_TYPE = null;
    public static final com.alibaba.fastjson.asm.Type INT_TYPE = null;
    public static final com.alibaba.fastjson.asm.Type LONG_TYPE = null;
    public static final com.alibaba.fastjson.asm.Type SHORT_TYPE = null;
    public static final com.alibaba.fastjson.asm.Type VOID_TYPE = null;
    private final char[] buf;
    private final int len;
    private final int off;
    protected final int sort;

    static {
            com.alibaba.fastjson.asm.Type r0 = new com.alibaba.fastjson.asm.Type
            r1 = 0
            r2 = 0
            r3 = 1443168256(0x56050000, float:3.655876E13)
            r4 = 1
            r0.<init>(r1, r2, r3, r4)
            com.alibaba.fastjson.asm.Type.VOID_TYPE = r0
            com.alibaba.fastjson.asm.Type r0 = new com.alibaba.fastjson.asm.Type
            r1 = 1509950721(0x5a000501, float:9.008575E15)
            r0.<init>(r4, r2, r1, r4)
            com.alibaba.fastjson.asm.Type.BOOLEAN_TYPE = r0
            com.alibaba.fastjson.asm.Type r0 = new com.alibaba.fastjson.asm.Type
            r1 = 2
            r3 = 1124075009(0x43000601, float:128.02345)
            r0.<init>(r1, r2, r3, r4)
            com.alibaba.fastjson.asm.Type.CHAR_TYPE = r0
            com.alibaba.fastjson.asm.Type r0 = new com.alibaba.fastjson.asm.Type
            r1 = 3
            r3 = 1107297537(0x42000501, float:32.004887)
            r0.<init>(r1, r2, r3, r4)
            com.alibaba.fastjson.asm.Type.BYTE_TYPE = r0
            com.alibaba.fastjson.asm.Type r0 = new com.alibaba.fastjson.asm.Type
            r1 = 4
            r3 = 1392510721(0x53000701, float:5.498733E11)
            r0.<init>(r1, r2, r3, r4)
            com.alibaba.fastjson.asm.Type.SHORT_TYPE = r0
            com.alibaba.fastjson.asm.Type r0 = new com.alibaba.fastjson.asm.Type
            r1 = 5
            r3 = 1224736769(0x49000001, float:524288.06)
            r0.<init>(r1, r2, r3, r4)
            com.alibaba.fastjson.asm.Type.INT_TYPE = r0
            com.alibaba.fastjson.asm.Type r0 = new com.alibaba.fastjson.asm.Type
            r1 = 6
            r3 = 1174536705(0x46020201, float:8320.501)
            r0.<init>(r1, r2, r3, r4)
            com.alibaba.fastjson.asm.Type.FLOAT_TYPE = r0
            com.alibaba.fastjson.asm.Type r0 = new com.alibaba.fastjson.asm.Type
            r1 = 7
            r3 = 1241579778(0x4a010102, float:2113600.5)
            r0.<init>(r1, r2, r3, r4)
            com.alibaba.fastjson.asm.Type.LONG_TYPE = r0
            com.alibaba.fastjson.asm.Type r0 = new com.alibaba.fastjson.asm.Type
            r1 = 8
            r3 = 1141048066(0x44030302, float:524.047)
            r0.<init>(r1, r2, r3, r4)
            com.alibaba.fastjson.asm.Type.DOUBLE_TYPE = r0
            return
    }

    private Type(int r1, char[] r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.sort = r1
            r0.buf = r2
            r0.off = r3
            r0.len = r4
            return
    }

    public static int getArgumentsAndReturnSizes(java.lang.String r7) {
            r0 = 1
            r1 = 1
            r2 = 1
        L3:
            int r3 = r1 + 1
            char r1 = r7.charAt(r1)
            r4 = 41
            r5 = 74
            r6 = 68
            if (r1 != r4) goto L25
            char r7 = r7.charAt(r3)
            r1 = 2
            int r2 = r2 << r1
            r3 = 86
            if (r7 != r3) goto L1d
            r0 = 0
            goto L22
        L1d:
            if (r7 == r6) goto L21
            if (r7 != r5) goto L22
        L21:
            r0 = 2
        L22:
            r7 = r2 | r0
            return r7
        L25:
            r4 = 76
            if (r1 != r4) goto L38
        L29:
            int r1 = r3 + 1
            char r3 = r7.charAt(r3)
            r4 = 59
            if (r3 == r4) goto L35
            r3 = r1
            goto L29
        L35:
            int r2 = r2 + 1
            goto L3
        L38:
            if (r1 == r6) goto L41
            if (r1 != r5) goto L3d
            goto L41
        L3d:
            int r2 = r2 + 1
        L3f:
            r1 = r3
            goto L3
        L41:
            int r2 = r2 + 2
            goto L3f
    }

    public static com.alibaba.fastjson.asm.Type getType(java.lang.String r1) {
            char[] r1 = r1.toCharArray()
            r0 = 0
            com.alibaba.fastjson.asm.Type r1 = getType(r1, r0)
            return r1
    }

    private static com.alibaba.fastjson.asm.Type getType(char[] r5, int r6) {
            char r0 = r5[r6]
            r1 = 70
            if (r0 == r1) goto L70
            r1 = 83
            if (r0 == r1) goto L6d
            r1 = 86
            if (r0 == r1) goto L6a
            r1 = 73
            if (r0 == r1) goto L67
            r1 = 74
            if (r0 == r1) goto L64
            r1 = 90
            if (r0 == r1) goto L61
            r1 = 59
            r2 = 91
            r3 = 1
            if (r0 == r2) goto L41
            switch(r0) {
                case 66: goto L3e;
                case 67: goto L3b;
                case 68: goto L38;
                default: goto L24;
            }
        L24:
            r0 = 1
        L25:
            int r2 = r6 + r0
            char r2 = r5[r2]
            if (r2 == r1) goto L2e
            int r0 = r0 + 1
            goto L25
        L2e:
            com.alibaba.fastjson.asm.Type r1 = new com.alibaba.fastjson.asm.Type
            int r6 = r6 + r3
            int r0 = r0 - r3
            r2 = 10
            r1.<init>(r2, r5, r6, r0)
            return r1
        L38:
            com.alibaba.fastjson.asm.Type r5 = com.alibaba.fastjson.asm.Type.DOUBLE_TYPE
            return r5
        L3b:
            com.alibaba.fastjson.asm.Type r5 = com.alibaba.fastjson.asm.Type.CHAR_TYPE
            return r5
        L3e:
            com.alibaba.fastjson.asm.Type r5 = com.alibaba.fastjson.asm.Type.BYTE_TYPE
            return r5
        L41:
            r0 = 1
        L42:
            int r4 = r6 + r0
            char r4 = r5[r4]
            if (r4 != r2) goto L4b
            int r0 = r0 + 1
            goto L42
        L4b:
            r2 = 76
            if (r4 != r2) goto L58
        L4f:
            int r0 = r0 + 1
            int r2 = r6 + r0
            char r2 = r5[r2]
            if (r2 == r1) goto L58
            goto L4f
        L58:
            com.alibaba.fastjson.asm.Type r1 = new com.alibaba.fastjson.asm.Type
            r2 = 9
            int r0 = r0 + r3
            r1.<init>(r2, r5, r6, r0)
            return r1
        L61:
            com.alibaba.fastjson.asm.Type r5 = com.alibaba.fastjson.asm.Type.BOOLEAN_TYPE
            return r5
        L64:
            com.alibaba.fastjson.asm.Type r5 = com.alibaba.fastjson.asm.Type.LONG_TYPE
            return r5
        L67:
            com.alibaba.fastjson.asm.Type r5 = com.alibaba.fastjson.asm.Type.INT_TYPE
            return r5
        L6a:
            com.alibaba.fastjson.asm.Type r5 = com.alibaba.fastjson.asm.Type.VOID_TYPE
            return r5
        L6d:
            com.alibaba.fastjson.asm.Type r5 = com.alibaba.fastjson.asm.Type.SHORT_TYPE
            return r5
        L70:
            com.alibaba.fastjson.asm.Type r5 = com.alibaba.fastjson.asm.Type.FLOAT_TYPE
            return r5
    }

    java.lang.String getDescriptor() {
            r4 = this;
            java.lang.String r0 = new java.lang.String
            char[] r1 = r4.buf
            int r2 = r4.off
            int r3 = r4.len
            r0.<init>(r1, r2, r3)
            return r0
    }

    public java.lang.String getInternalName() {
            r4 = this;
            java.lang.String r0 = new java.lang.String
            char[] r1 = r4.buf
            int r2 = r4.off
            int r3 = r4.len
            r0.<init>(r1, r2, r3)
            return r0
    }
}
