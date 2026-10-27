package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface Dns {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Dns.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Dns SYSTEM = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        static final /* synthetic */ okhttp3.Dns.Companion $$INSTANCE = null;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static final class DnsSystem implements okhttp3.Dns {
            public DnsSystem() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // okhttp3.Dns
            @org.jetbrains.annotations.NotNull
            public java.util.List<java.net.InetAddress> lookup(@org.jetbrains.annotations.NotNull java.lang.String r5) {
                    r4 = this;
                    java.lang.String r0 = "hostname"
                    kotlin.jvm.internal.g0.p(r5, r0)
                    java.net.InetAddress[] r0 = java.net.InetAddress.getAllByName(r5)     // Catch: java.lang.NullPointerException -> L13
                    java.lang.String r1 = "getAllByName(...)"
                    kotlin.jvm.internal.g0.o(r0, r1)     // Catch: java.lang.NullPointerException -> L13
                    java.util.List r5 = kotlin.collections.n.dz(r0)     // Catch: java.lang.NullPointerException -> L13
                    return r5
                L13:
                    r0 = move-exception
                    java.net.UnknownHostException r1 = new java.net.UnknownHostException
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "Broken system behaviour for dns lookup of "
                    r2.append(r3)
                    r2.append(r5)
                    java.lang.String r5 = r2.toString()
                    r1.<init>(r5)
                    r1.initCause(r0)
                    throw r1
            }
        }

        static {
                okhttp3.Dns$Companion r0 = new okhttp3.Dns$Companion
                r0.<init>()
                okhttp3.Dns.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            okhttp3.Dns$Companion r0 = okhttp3.Dns.Companion.$$INSTANCE
            okhttp3.Dns.Companion = r0
            okhttp3.Dns$Companion$DnsSystem r0 = new okhttp3.Dns$Companion$DnsSystem
            r0.<init>()
            okhttp3.Dns.SYSTEM = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    java.util.List<java.net.InetAddress> lookup(@org.jetbrains.annotations.NotNull java.lang.String r1) throws java.net.UnknownHostException;
}
