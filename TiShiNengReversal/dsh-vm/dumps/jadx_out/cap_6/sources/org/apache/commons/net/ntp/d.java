package org.apache.commons.net.ntp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface d {
    public static final int a = 123;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 3;
    public static final int j = 4;
    public static final int k = 5;
    public static final int l = 6;
    public static final int m = 7;
    public static final int n = 4;
    public static final int o = 14;
    public static final int p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f58q = 10;
    public static final int r = 3;
    public static final int s = 4;
    public static final java.lang.String t = "NTP";
    public static final java.lang.String u = "ICMP";
    public static final java.lang.String v = "TIME";
    public static final java.lang.String w = "DAYTIME";

    double A();

    void B(int r1);

    org.apache.commons.net.ntp.TimeStamp C();

    void D(java.net.DatagramPacket r1);

    int a();

    int b();

    double c();

    int d();

    long e();

    void f(int r1);

    org.apache.commons.net.ntp.TimeStamp g();

    int getMode();

    java.lang.String getType();

    int getVersion();

    void h(int r1);

    void i(org.apache.commons.net.ntp.TimeStamp r1);

    int j();

    void k(org.apache.commons.net.ntp.TimeStamp r1);

    void l(org.apache.commons.net.ntp.TimeStamp r1);

    java.lang.String m();

    java.lang.String n();

    void o(int r1);

    int p();

    org.apache.commons.net.ntp.TimeStamp q();

    void r(int r1);

    java.net.DatagramPacket s();

    void setVersion(int r1);

    org.apache.commons.net.ntp.TimeStamp t();

    void u(int r1);

    int v();

    void w(org.apache.commons.net.ntp.TimeStamp r1);

    void x(int r1);

    int y();

    void z(int r1);
}
