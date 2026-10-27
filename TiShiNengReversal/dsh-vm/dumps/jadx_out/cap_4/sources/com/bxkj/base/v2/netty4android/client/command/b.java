package com.bxkj.base.v2.netty4android.client.command;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface b {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.base.v2.netty4android.client.command.b.a a = null;
    public static final byte b = 2;
    public static final byte c = 4;
    public static final byte d = 6;
    public static final byte e = 7;
    public static final byte f = 8;
    public static final byte g = 16;
    public static final byte h = 18;
    public static final byte i = 20;
    public static final byte j = 21;
    public static final byte k = 22;

    /* renamed from: l, reason: collision with root package name */
    public static final byte f621l = 24;

    /* renamed from: m, reason: collision with root package name */
    public static final byte f622m = 25;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        static final /* synthetic */ com.bxkj.base.v2.netty4android.client.command.b.a a = null;
        private static boolean b = false;
        private static final byte c = 1;
        public static final byte d = 2;
        private static final byte e = 33;
        public static final byte f = 4;
        public static final byte g = 6;
        public static final byte h = 7;
        public static final byte i = 8;
        private static final byte j = 9;
        public static final byte k = 16;

        /* renamed from: l, reason: collision with root package name */
        private static final byte f623l = 17;

        /* renamed from: m, reason: collision with root package name */
        public static final byte f624m = 18;

        /* renamed from: n, reason: collision with root package name */
        private static final byte f625n = 19;

        /* renamed from: o, reason: collision with root package name */
        public static final byte f626o = 20;

        /* renamed from: p, reason: collision with root package name */
        public static final byte f627p = 21;

        /* renamed from: q, reason: collision with root package name */
        public static final byte f628q = 22;

        /* renamed from: r, reason: collision with root package name */
        private static final byte f629r = 23;

        /* renamed from: s, reason: collision with root package name */
        public static final byte f630s = 24;

        /* renamed from: t, reason: collision with root package name */
        public static final byte f631t = 25;

        static {
                com.bxkj.base.v2.netty4android.client.command.b$a r0 = new com.bxkj.base.v2.netty4android.client.command.b$a
                r0.<init>()
                com.bxkj.base.v2.netty4android.client.command.b.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final com.bxkj.base.v2.netty4android.client.command.a a(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull java.lang.String r11) {
                r6 = this;
                java.lang.String r0 = "userName"
                kotlin.jvm.internal.g0.p(r7, r0)
                java.lang.String r1 = "basUserId"
                kotlin.jvm.internal.g0.p(r8, r1)
                java.lang.String r2 = "secret"
                kotlin.jvm.internal.g0.p(r9, r2)
                java.lang.String r3 = "appVersion"
                kotlin.jvm.internal.g0.p(r10, r3)
                java.lang.String r4 = "schoolCode"
                kotlin.jvm.internal.g0.p(r11, r4)
                org.json.JSONObject r5 = new org.json.JSONObject
                r5.<init>()
                org.json.JSONObject r7 = r5.put(r0, r7)
                org.json.JSONObject r7 = r7.put(r1, r8)
                org.json.JSONObject r7 = r7.put(r2, r9)
                java.lang.String r8 = "type"
                java.lang.String r9 = com.bxkj.base.util.b0.f()
                org.json.JSONObject r7 = r7.put(r8, r9)
                org.json.JSONObject r7 = r7.put(r3, r10)
                org.json.JSONObject r7 = r7.put(r4, r11)
                java.lang.String r7 = r7.toString()
                java.lang.String r8 = "toString(...)"
                kotlin.jvm.internal.g0.o(r7, r8)
                com.bxkj.base.v2.netty4android.client.command.a r8 = new com.bxkj.base.v2.netty4android.client.command.a
                r9 = 1
                int r10 = r7.length()
                r8.<init>(r9, r10, r7)
                return r8
        }

        @org.jetbrains.annotations.NotNull
        public final com.bxkj.base.v2.netty4android.client.command.a b() {
                r4 = this;
                com.bxkj.base.v2.netty4android.client.command.a r0 = new com.bxkj.base.v2.netty4android.client.command.a
                r1 = 0
                java.lang.String r2 = ""
                r3 = 33
                r0.<init>(r3, r1, r2)
                return r0
        }

        public final boolean c() {
                r1 = this;
                boolean r0 = com.bxkj.base.v2.netty4android.client.command.b.a.b
                return r0
        }

        public final void d(boolean r1) {
                r0 = this;
                com.bxkj.base.v2.netty4android.client.command.b.a.b = r1
                return
        }
    }

    static {
            com.bxkj.base.v2.netty4android.client.command.b$a r0 = com.bxkj.base.v2.netty4android.client.command.b.a.a
            com.bxkj.base.v2.netty4android.client.command.b.a = r0
            return
    }
}
