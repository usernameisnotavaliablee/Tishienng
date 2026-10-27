package xyz.adscope.common.network.cookie;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface CookieStore {
    public static final xyz.adscope.common.network.cookie.CookieStore DEFAULT = null;


    static {
            xyz.adscope.common.network.cookie.CookieStore$1 r0 = new xyz.adscope.common.network.cookie.CookieStore$1
            r0.<init>()
            xyz.adscope.common.network.cookie.CookieStore.DEFAULT = r0
            return
    }

    void add(java.net.URI r1, java.net.HttpCookie r2);

    void clear();

    java.util.List<java.net.HttpCookie> get(java.net.URI r1);

    void remove(java.net.HttpCookie r1);
}
