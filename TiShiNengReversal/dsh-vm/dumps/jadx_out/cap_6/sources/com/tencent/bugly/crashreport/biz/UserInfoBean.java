package com.tencent.bugly.crashreport.biz;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UserInfoBean implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.bugly.crashreport.biz.UserInfoBean> CREATOR = null;
    public long a;
    public int b;
    public java.lang.String c;
    public java.lang.String d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public java.lang.String j;
    public long k;
    public boolean l;
    public java.lang.String m;
    public java.lang.String n;
    public int o;
    public int p;

    /* renamed from: q, reason: collision with root package name */
    public int f8q;
    public java.util.Map<java.lang.String, java.lang.String> r;
    public java.util.Map<java.lang.String, java.lang.String> s;


    static {
            com.tencent.bugly.crashreport.biz.UserInfoBean$1 r0 = new com.tencent.bugly.crashreport.biz.UserInfoBean$1
            r0.<init>()
            com.tencent.bugly.crashreport.biz.UserInfoBean.CREATOR = r0
            return
    }

    public UserInfoBean() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.k = r0
            r0 = 0
            r2.l = r0
            java.lang.String r0 = "unknown"
            r2.m = r0
            r0 = -1
            r2.p = r0
            r2.f8q = r0
            r0 = 0
            r2.r = r0
            r2.s = r0
            return
    }

    public UserInfoBean(android.os.Parcel r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.k = r0
            r0 = 0
            r3.l = r0
            java.lang.String r1 = "unknown"
            r3.m = r1
            r1 = -1
            r3.p = r1
            r3.f8q = r1
            r1 = 0
            r3.r = r1
            r3.s = r1
            int r1 = r4.readInt()
            r3.b = r1
            java.lang.String r1 = r4.readString()
            r3.c = r1
            java.lang.String r1 = r4.readString()
            r3.d = r1
            long r1 = r4.readLong()
            r3.e = r1
            long r1 = r4.readLong()
            r3.f = r1
            long r1 = r4.readLong()
            r3.g = r1
            long r1 = r4.readLong()
            r3.h = r1
            long r1 = r4.readLong()
            r3.i = r1
            java.lang.String r1 = r4.readString()
            r3.j = r1
            long r1 = r4.readLong()
            r3.k = r1
            byte r1 = r4.readByte()
            r2 = 1
            if (r1 != r2) goto L5c
            r0 = 1
        L5c:
            r3.l = r0
            java.lang.String r0 = r4.readString()
            r3.m = r0
            int r0 = r4.readInt()
            r3.p = r0
            int r0 = r4.readInt()
            r3.f8q = r0
            java.util.Map r0 = com.tencent.bugly.proguard.ap.b(r4)
            r3.r = r0
            java.util.Map r0 = com.tencent.bugly.proguard.ap.b(r4)
            r3.s = r0
            java.lang.String r0 = r4.readString()
            r3.n = r0
            int r4 = r4.readInt()
            r3.o = r4
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = r2.b
            r3.writeInt(r4)
            java.lang.String r4 = r2.c
            r3.writeString(r4)
            java.lang.String r4 = r2.d
            r3.writeString(r4)
            long r0 = r2.e
            r3.writeLong(r0)
            long r0 = r2.f
            r3.writeLong(r0)
            long r0 = r2.g
            r3.writeLong(r0)
            long r0 = r2.h
            r3.writeLong(r0)
            long r0 = r2.i
            r3.writeLong(r0)
            java.lang.String r4 = r2.j
            r3.writeString(r4)
            long r0 = r2.k
            r3.writeLong(r0)
            boolean r4 = r2.l
            byte r4 = (byte) r4
            r3.writeByte(r4)
            java.lang.String r4 = r2.m
            r3.writeString(r4)
            int r4 = r2.p
            r3.writeInt(r4)
            int r4 = r2.f8q
            r3.writeInt(r4)
            java.util.Map<java.lang.String, java.lang.String> r4 = r2.r
            com.tencent.bugly.proguard.ap.b(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r4 = r2.s
            com.tencent.bugly.proguard.ap.b(r3, r4)
            java.lang.String r4 = r2.n
            r3.writeString(r4)
            int r4 = r2.o
            r3.writeInt(r4)
            return
    }
}
