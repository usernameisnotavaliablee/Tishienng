package com.bxkj.base.v2.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface c {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.base.v2.data.c.a a = null;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        static final /* synthetic */ com.bxkj.base.v2.data.c.a a = null;
        public static final int b = 0;
        public static final int c = 1;
        public static final int d = 2;
        public static final int e = 3;
        public static final int f = 4;
        public static final int g = 5;

        static {
                com.bxkj.base.v2.data.c$a r0 = new com.bxkj.base.v2.data.c$a
                r0.<init>()
                com.bxkj.base.v2.data.c.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String a(int r2) {
                r1 = this;
                r0 = 1
                if (r2 == r0) goto L1e
                r0 = 2
                if (r2 == r0) goto L1b
                r0 = 3
                if (r2 == r0) goto L18
                r0 = 4
                if (r2 == r0) goto L15
                r0 = 5
                if (r2 == r0) goto L12
                java.lang.String r2 = "默认卡->只读取物理卡号"
                return r2
            L12:
                java.lang.String r2 = "北京邮电大学世纪学院学生卡->从卡中读取学生学号和姓名"
                return r2
            L15:
                java.lang.String r2 = "信阳师范学院学生卡->从卡中读取学生学号和姓名"
                return r2
            L18:
                java.lang.String r2 = "北京科技大学体测信息卡->从卡中读取学生学号和姓名"
                return r2
            L1b:
                java.lang.String r2 = "外交学院体测信息卡->从卡中读取学生学号和姓名"
                return r2
            L1e:
                java.lang.String r2 = "体适能健康测试卡->从卡中读取学生学号和姓名"
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String b() {
                r1 = this;
                com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
                com.bxkj.base.v2.data.b r0 = r0.a()
                int r0 = r0.E()
                java.lang.String r0 = r1.a(r0)
                return r0
        }
    }

    static {
            com.bxkj.base.v2.data.c$a r0 = com.bxkj.base.v2.data.c.a.a
            com.bxkj.base.v2.data.c.a = r0
            return
    }
}
