package com.beizi.fusion.events;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b implements java.util.Observer {
    public com.beizi.fusion.events.a.i a;
    public com.beizi.fusion.events.a.h b;
    public com.beizi.fusion.events.a.k c;
    public com.beizi.fusion.events.a.g d;
    public com.beizi.fusion.events.a.d e;
    public com.beizi.fusion.events.a.e f;
    public com.beizi.fusion.events.a.f g;
    public com.beizi.fusion.events.a.c h;
    public com.beizi.fusion.events.a.b i;
    public com.beizi.fusion.events.a.j j;
    public com.beizi.fusion.events.a.C0000a k;

    /* renamed from: l, reason: collision with root package name */
    private final com.beizi.fusion.events.a f18l;

    /* renamed from: m, reason: collision with root package name */
    private com.beizi.fusion.events.EventBean f19m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f20n;

    public b(com.beizi.fusion.events.EventBean r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f20n = r0
            r1.f19m = r2
            com.beizi.fusion.events.a r2 = new com.beizi.fusion.events.a
            r2.<init>()
            r1.f18l = r2
            com.beizi.fusion.events.a$i r0 = new com.beizi.fusion.events.a$i
            r0.<init>(r2)
            r1.a = r0
            com.beizi.fusion.events.a$h r0 = new com.beizi.fusion.events.a$h
            r0.<init>(r2)
            r1.b = r0
            com.beizi.fusion.events.a$k r0 = new com.beizi.fusion.events.a$k
            r0.<init>(r2)
            r1.c = r0
            com.beizi.fusion.events.a$g r0 = new com.beizi.fusion.events.a$g
            r0.<init>(r2)
            r1.d = r0
            com.beizi.fusion.events.a$d r0 = new com.beizi.fusion.events.a$d
            r0.<init>(r2)
            r1.e = r0
            com.beizi.fusion.events.a$e r0 = new com.beizi.fusion.events.a$e
            r0.<init>(r2)
            r1.f = r0
            com.beizi.fusion.events.a$f r0 = new com.beizi.fusion.events.a$f
            r0.<init>(r2)
            r1.g = r0
            com.beizi.fusion.events.a$c r0 = new com.beizi.fusion.events.a$c
            r0.<init>(r2)
            r1.h = r0
            com.beizi.fusion.events.a$b r0 = new com.beizi.fusion.events.a$b
            r0.<init>(r2)
            r1.i = r0
            com.beizi.fusion.events.a$j r0 = new com.beizi.fusion.events.a$j
            r0.<init>(r2)
            r1.j = r0
            com.beizi.fusion.events.a$a r0 = new com.beizi.fusion.events.a$a
            r0.<init>(r2)
            r1.k = r0
            return
    }

    public com.beizi.fusion.events.a a() {
            r1 = this;
            com.beizi.fusion.events.a r0 = r1.f18l
            return r0
    }

    public void a(boolean r1) {
            r0 = this;
            r0.f20n = r1
            return
    }

    public com.beizi.fusion.events.EventBean b() {
            r1 = this;
            com.beizi.fusion.events.EventBean r0 = r1.f19m
            return r0
    }

    public boolean c() {
            r1 = this;
            boolean r0 = r1.f20n
            return r0
    }

    @Override // java.util.Observer
    public void update(java.util.Observable r8, java.lang.Object r9) {
            r7 = this;
            boolean r8 = r8 instanceof com.beizi.fusion.events.a.l
            if (r8 == 0) goto L87
            boolean r8 = r9 instanceof com.beizi.fusion.events.EventBean
            if (r8 == 0) goto L87
            com.beizi.fusion.events.EventBean r9 = (com.beizi.fusion.events.EventBean) r9
            java.lang.String r8 = r9.getBuyerId()
            java.lang.String r0 = r9.getEventCode()
            int r1 = r9.getBeiZiSrcType()
            java.lang.String r2 = r9.getBeiZiPrice()
            java.lang.String r3 = r9.getBidPrice()
            java.lang.String r4 = r9.getReqId()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "channel == "
            r5.append(r6)
            r5.append(r8)
            java.lang.String r8 = ",eventCode = "
            r5.append(r8)
            r5.append(r0)
            java.lang.String r8 = ";buyerSpaceId:"
            r5.append(r8)
            java.lang.String r8 = r9.getBuyerSpaceUuId()
            r5.append(r8)
            java.lang.String r8 = ",srcType = "
            r5.append(r8)
            r5.append(r1)
            java.lang.String r8 = ",price = "
            r5.append(r8)
            r5.append(r2)
            java.lang.String r8 = ",bidPrice = "
            r5.append(r8)
            r5.append(r3)
            java.lang.String r8 = ",eventId = "
            r5.append(r8)
            r5.append(r4)
            java.lang.String r8 = ",buyerSpaceId = "
            r5.append(r8)
            java.lang.String r8 = r9.getBuyerSpaceId()
            r5.append(r8)
            java.lang.String r8 = r5.toString()
            java.lang.String r0 = "BeiZis"
            com.beizi.fusion.tool.aa.a(r0, r8)
            com.beizi.fusion.c.b r8 = com.beizi.fusion.c.b.a()
            android.content.Context r8 = r8.e()
            com.beizi.fusion.events.EventCar r8 = com.beizi.fusion.events.EventCar.getInstance(r8)
            r8.goRoad(r9)
        L87:
            return
    }
}
