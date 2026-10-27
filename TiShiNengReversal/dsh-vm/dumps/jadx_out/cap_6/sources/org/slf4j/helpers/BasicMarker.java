package org.slf4j.helpers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class BasicMarker implements org.slf4j.Marker {
    private static java.lang.String CLOSE = " ]";
    private static java.lang.String OPEN = "[ ";
    private static java.lang.String SEP = ", ";
    private static final long serialVersionUID = 1803952589649545191L;
    private final java.lang.String name;
    private java.util.List<org.slf4j.Marker> referenceList;

    static {
            return
    }

    BasicMarker(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.name = r2
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "A marker name cannot be null"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.slf4j.Marker
    public synchronized void add(org.slf4j.Marker r2) {
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L28
            boolean r0 = r1.contains(r2)     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto Lb
            monitor-exit(r1)
            return
        Lb:
            boolean r0 = r2.contains(r1)     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L13
            monitor-exit(r1)
            return
        L13:
            java.util.List<org.slf4j.Marker> r0 = r1.referenceList     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L21
            java.util.Vector r0 = new java.util.Vector     // Catch: java.lang.Throwable -> L1f
            r0.<init>()     // Catch: java.lang.Throwable -> L1f
            r1.referenceList = r0     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r2 = move-exception
            goto L30
        L21:
            java.util.List<org.slf4j.Marker> r0 = r1.referenceList     // Catch: java.lang.Throwable -> L1f
            r0.add(r2)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)
            return
        L28:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = "A null value cannot be added to a Marker as reference."
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L1f
            throw r2     // Catch: java.lang.Throwable -> L1f
        L30:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r2
    }

    @Override // org.slf4j.Marker
    public boolean contains(java.lang.String r4) {
            r3 = this;
            if (r4 == 0) goto L2d
            java.lang.String r0 = r3.name
            boolean r0 = r0.equals(r4)
            r1 = 1
            if (r0 == 0) goto Lc
            return r1
        Lc:
            boolean r0 = r3.hasReferences()
            if (r0 == 0) goto L2b
            java.util.List<org.slf4j.Marker> r0 = r3.referenceList
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r0.next()
            org.slf4j.Marker r2 = (org.slf4j.Marker) r2
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L18
            return r1
        L2b:
            r4 = 0
            return r4
        L2d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Other cannot be null"
            r4.<init>(r0)
            throw r4
    }

    @Override // org.slf4j.Marker
    public boolean contains(org.slf4j.Marker r4) {
            r3 = this;
            if (r4 == 0) goto L2b
            boolean r0 = r3.equals(r4)
            r1 = 1
            if (r0 == 0) goto La
            return r1
        La:
            boolean r0 = r3.hasReferences()
            if (r0 == 0) goto L29
            java.util.List<org.slf4j.Marker> r0 = r3.referenceList
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.next()
            org.slf4j.Marker r2 = (org.slf4j.Marker) r2
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L16
            return r1
        L29:
            r4 = 0
            return r4
        L2b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Other cannot be null"
            r4.<init>(r0)
            throw r4
    }

    @Override // org.slf4j.Marker
    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            boolean r1 = r3 instanceof org.slf4j.Marker
            if (r1 != 0) goto Ld
            return r0
        Ld:
            org.slf4j.Marker r3 = (org.slf4j.Marker) r3
            java.lang.String r0 = r2.name
            java.lang.String r3 = r3.getName()
            boolean r3 = r0.equals(r3)
            return r3
    }

    @Override // org.slf4j.Marker
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // org.slf4j.Marker
    public boolean hasChildren() {
            r1 = this;
            boolean r0 = r1.hasReferences()
            return r0
    }

    @Override // org.slf4j.Marker
    public synchronized boolean hasReferences() {
            r1 = this;
            monitor-enter(r1)
            java.util.List<org.slf4j.Marker> r0 = r1.referenceList     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Ld
            if (r0 <= 0) goto Lf
            r0 = 1
            goto L10
        Ld:
            r0 = move-exception
            goto L12
        Lf:
            r0 = 0
        L10:
            monitor-exit(r1)
            return r0
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    @Override // org.slf4j.Marker
    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.name
            int r0 = r0.hashCode()
            return r0
    }

    @Override // org.slf4j.Marker
    public synchronized java.util.Iterator<org.slf4j.Marker> iterator() {
            r1 = this;
            monitor-enter(r1)
            java.util.List<org.slf4j.Marker> r0 = r1.referenceList     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return r0
        Lb:
            r0 = move-exception
            goto L15
        Ld:
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> Lb
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return r0
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    @Override // org.slf4j.Marker
    public synchronized boolean remove(org.slf4j.Marker r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.List<org.slf4j.Marker> r0 = r4.referenceList     // Catch: java.lang.Throwable -> L25
            r1 = 0
            if (r0 != 0) goto L8
            monitor-exit(r4)
            return r1
        L8:
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L25
            r2 = 0
        Ld:
            if (r2 >= r0) goto L2a
            java.util.List<org.slf4j.Marker> r3 = r4.referenceList     // Catch: java.lang.Throwable -> L25
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L25
            org.slf4j.Marker r3 = (org.slf4j.Marker) r3     // Catch: java.lang.Throwable -> L25
            boolean r3 = r5.equals(r3)     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L27
            java.util.List<org.slf4j.Marker> r5 = r4.referenceList     // Catch: java.lang.Throwable -> L25
            r5.remove(r2)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r4)
            r5 = 1
            return r5
        L25:
            r5 = move-exception
            goto L2c
        L27:
            int r2 = r2 + 1
            goto Ld
        L2a:
            monitor-exit(r4)
            return r1
        L2c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L25
            throw r5
    }

    public java.lang.String toString() {
            r3 = this;
            boolean r0 = r3.hasReferences()
            if (r0 != 0) goto Lb
            java.lang.String r0 = r3.getName()
            return r0
        Lb:
            java.util.Iterator r0 = r3.iterator()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = r3.getName()
            r1.<init>(r2)
            r2 = 32
            r1.append(r2)
            java.lang.String r2 = org.slf4j.helpers.BasicMarker.OPEN
            r1.append(r2)
        L22:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L41
            java.lang.Object r2 = r0.next()
            org.slf4j.Marker r2 = (org.slf4j.Marker) r2
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L22
            java.lang.String r2 = org.slf4j.helpers.BasicMarker.SEP
            r1.append(r2)
            goto L22
        L41:
            java.lang.String r0 = org.slf4j.helpers.BasicMarker.CLOSE
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
