package io.netty.channel.epoll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class TcpMd5Util {
    private TcpMd5Util() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.util.Collection<java.net.InetAddress> newTcpMd5Sigs(io.netty.channel.epoll.AbstractEpollChannel r5, java.util.Collection<java.net.InetAddress> r6, java.util.Map<java.net.InetAddress, byte[]> r7) throws java.io.IOException {
            java.lang.String r0 = "channel"
            io.netty.util.internal.ObjectUtil.checkNotNull(r5, r0)
            java.lang.String r0 = "current"
            io.netty.util.internal.ObjectUtil.checkNotNull(r6, r0)
            java.lang.String r0 = "newKeys"
            io.netty.util.internal.ObjectUtil.checkNotNull(r7, r0)
            java.util.Set r0 = r7.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb5
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            byte[] r2 = (byte[]) r2
            java.lang.Object r3 = r1.getKey()
            if (r3 == 0) goto L9e
            java.lang.String r3 = "newKeys["
            if (r2 == 0) goto L80
            int r4 = r2.length
            if (r4 == 0) goto L62
            int r2 = r2.length
            int r4 = io.netty.channel.epoll.Native.TCP_MD5SIG_MAXKEYLEN
            if (r2 > r4) goto L3c
            goto L17
        L3c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.Object r7 = r1.getKey()
            r6.append(r7)
            java.lang.String r7 = "] has a key with invalid length; should not exceed the maximum length ("
            r6.append(r7)
            r6.append(r4)
            r7 = 41
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L62:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.Object r7 = r1.getKey()
            r6.append(r7)
            java.lang.String r7 = "] has an empty key."
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L80:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.Object r7 = r1.getKey()
            r6.append(r7)
            r7 = 93
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L9e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "newKeys contains an entry with null address: "
            r6.append(r0)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        Lb5:
            java.util.Iterator r6 = r6.iterator()
        Lb9:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Ld2
            java.lang.Object r0 = r6.next()
            java.net.InetAddress r0 = (java.net.InetAddress) r0
            boolean r1 = r7.containsKey(r0)
            if (r1 != 0) goto Lb9
            io.netty.channel.epoll.LinuxSocket r1 = r5.socket
            r2 = 0
            r1.setTcpMd5Sig(r0, r2)
            goto Lb9
        Ld2:
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto Ldb
            java.util.Set r5 = java.util.Collections.EMPTY_SET
            return r5
        Ldb:
            java.util.ArrayList r6 = new java.util.ArrayList
            int r0 = r7.size()
            r6.<init>(r0)
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        Lec:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L111
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            io.netty.channel.epoll.LinuxSocket r1 = r5.socket
            java.lang.Object r2 = r0.getKey()
            java.net.InetAddress r2 = (java.net.InetAddress) r2
            java.lang.Object r3 = r0.getValue()
            byte[] r3 = (byte[]) r3
            r1.setTcpMd5Sig(r2, r3)
            java.lang.Object r0 = r0.getKey()
            r6.add(r0)
            goto Lec
        L111:
            return r6
    }
}
