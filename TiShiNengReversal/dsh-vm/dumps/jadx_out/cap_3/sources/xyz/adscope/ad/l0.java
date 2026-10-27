package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class l0 {
    private final java.lang.String a;
    private final android.content.Context b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = null;

        static {
                xyz.adscope.ad.c[] r0 = xyz.adscope.ad.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                xyz.adscope.ad.l0.a.a = r0
                xyz.adscope.ad.c r1 = xyz.adscope.ad.c.h     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = xyz.adscope.ad.l0.a.a     // Catch: java.lang.NoSuchFieldError -> L1d
                xyz.adscope.ad.c r1 = xyz.adscope.ad.c.f     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = xyz.adscope.ad.l0.a.a     // Catch: java.lang.NoSuchFieldError -> L28
                xyz.adscope.ad.c r1 = xyz.adscope.ad.c.g     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = xyz.adscope.ad.l0.a.a     // Catch: java.lang.NoSuchFieldError -> L33
                xyz.adscope.ad.c r1 = xyz.adscope.ad.c.c     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = xyz.adscope.ad.l0.a.a     // Catch: java.lang.NoSuchFieldError -> L3e
                xyz.adscope.ad.c r1 = xyz.adscope.ad.c.d     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    l0(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "temp_%s_%s"
            r1.a = r0
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.b = r2
            return
    }

    private java.lang.String a(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = xyz.adscope.ad.f0.a()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r4
            java.lang.String r4 = "temp_%s_%s"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            return r4
    }

    private java.lang.String a(xyz.adscope.ad.c r3) {
            r2 = this;
            int[] r0 = xyz.adscope.ad.l0.a.a
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            if (r3 == r0) goto L22
            r0 = 2
            if (r3 == r0) goto L1f
            r0 = 3
            java.lang.String r1 = ""
            if (r3 == r0) goto L1e
            r0 = 4
            if (r3 == r0) goto L1e
            r0 = 5
            if (r3 == r0) goto L1b
            r3 = 0
            return r3
        L1b:
            java.lang.String r3 = "Ww0KICB7DQogICAgInVpZCI6ICIxMDAwMDEiLA0KICAgICJsYXllciI6IDEsDQogICAgIm1hcmdpblRvcCI6IHsNCiAgICAgICJzaXplIjogIjAiLA0KICAgICAgInJlZmVyZW5jZSI6ICJzdXBlciIsDQogICAgICAibGF5b3V0IjogInRvcCINCiAgICB9LA0KICAgICJtYXJnaW5MZWZ0Ijogew0KICAgICAgInNpemUiOiAiMCIsDQogICAgICAicmVmZXJlbmNlIjogInN1cGVyIiwNCiAgICAgICJsYXlvdXQiOiAibGVmdCINCiAgICB9LA0KICAgICJtYXJnaW5SaWdodCI6IHsNCiAgICAgICJzaXplIjogIjAiLA0KICAgICAgInJlZmVyZW5jZSI6ICJzdXBlciIsDQogICAgICAibGF5b3V0IjogInJpZ2h0Ig0KICAgIH0sDQogICAgIm1hcmdpbkJvdHRvbSI6IHsNCiAgICAgICJzaXplIjogIjAiLA0KICAgICAgInJlZmVyZW5jZSI6ICJzdXBlciIsDQogICAgICAibGF5b3V0IjogImJvdHRvbSINCiAgICB9LA0KICAgICJzdXBlclZpZXciOiAibm9uZSIsDQogICAgImJnQ29sb3IiOiAiI0ZGRkZGRiIsDQogICAgImNvbnRyb2xUeXBlIjogInZpZXciLA0KICAgICJiaW5kRXZlbnQiOiAiY2xpY2siLA0KICAgICJleGVjdXRpb24iOiAiY2xpY2siDQogIH0sDQogIHsNCiAgICAidWlkIjogIjExMDAwMSIsDQogICAgImxheWVyIjogMSwNCiAgICAibWFyZ2luVG9wIjogew0KICAgICAgInNpemUiOiAiMCIsDQogICAgICAicmVmZXJlbmNlIjogInN1cGVyIiwNCiAgICAgICJsYXlvdXQiOiAidG9wIg0KICAgIH0sDQogICAgIm1hcmdpbkxlZnQiOiB7DQogICAgICAic2l6ZSI6ICIwIiwNCiAgICAgICJyZWZlcmVuY2UiOiAic3VwZXIiLA0KICAgICAgImxheW91dCI6ICJsZWZ0Ig0KICAgIH0sDQogICAgIm1hcmdpblJpZ2h0Ijogew0KICAgICAgInNpemUiOiAiMCIsDQogICAgICAicmVmZXJlbmNlIjogInN1cGVyIiwNCiAgICAgICJsYXlvdXQiOiAicmlnaHQiDQogICAgfSwNCiAgICAibWFyZ2luQm90dG9tIjogew0KICAgICAgInNpemUiOiAiMCIsDQogICAgICAicmVmZXJlbmNlIjogInN1cGVyIiwNCiAgICAgICJsYXlvdXQiOiAiYm90dG9tIg0KICAgIH0sDQogICAgInN1cGVyVmlldyI6ICIxMDAwMDEiLA0KICAgICJiZ0NvbG9yIjogIiMwMDAwMDAwMCIsDQogICAgImNvbnRyb2xUeXBlIjogImltYWdlIiwNCiAgICAiaXNCbHVyIjogMSwNCiAgICAiYXNzZXRJZCI6ICIxMDAxIg0KICB9LA0KICB7DQogICAgInVpZCI6ICIxMjAwMDEiLA0KICAgICJsYXllciI6IDEwLA0KICAgICJtYXJnaW5Ub3AiOiB7DQogICAgICAic2l6ZSI6ICIxMCIsDQogICAgICAicmVmZXJlbmNlIjogInN1cGVyIiwNCiAgICAgICJsYXlvdXQiOiAidG9wIg0KICAgIH0sDQogICAgIm1hcmdpblJpZ2h0Ijogew0KICAgICAgInNpemUiOiAiLTEwIiwNCiAgICAgICJyZWZlcmVuY2UiOiAic3VwZXIiLA0KICAgICAgImxheW91dCI6ICJyaWdodCINCiAgICB9LA0KICAgICJoZWlnaHQiOiB7DQogICAgICAic2l6ZSI6ICIyMiIsDQogICAgICAicmVmZXJlbmNlIjogIm93biIsDQogICAgICAibGF5b3V0IjogImhlaWdodCINCiAgICB9LA0KICAgICJ3aWR0aCI6IHsNCiAgICAgICJzaXplIjogIjYwIiwNCiAgICAgICJyZWZlcmVuY2UiOiAib3duIiwNCiAgICAgICJsYXlvdXQiOiAid2lkdGgiDQogICAgfSwNCiAgICAic3VwZXJWaWV3IjogIjEwMDAwMSIsDQogICAgImJnQ29sb3IiOiAiIzY2MzMzMzMzIiwNCiAgICAiYm9yZGVyUmFkaXVzIjogIjUwJSIsDQogICAgImNvbnRyb2xUeXBlIjogImNvdW50ZG93bmNsb3NlIiwNCiAgICAiYXV0b0Nsb3NlIjogMCwNCiAgICAiYmluZEV2ZW50IjogImNsaWNrIiwNCiAgICAiZXhlY3V0aW9uIjogImNsb3NlIiwNCiAgICAidGl0bGUiOiAi5YWz6ZetIiwNCiAgICAiZm9udFNpemUiOiAxMiwNCiAgICAidGV4dENvbG9yIjogIiNGRkZGRkYiLA0KICAgICJ0ZXh0QWxpZ24iOiAiY2VudGVyIiwNCiAgICAiY291bnREb3duVGltZSI6IDANCiAgfSwNCiAgew0KICAgICJ1aWQiOiAiMTMwMDAxIiwNCiAgICAibGF5ZXIiOiAyLA0KICAgICJtYXJnaW5Cb3R0b20iOiB7DQogICAgICAic2l6ZSI6ICItMTUiLA0KICAgICAgInJlZmVyZW5jZSI6ICIxMDAwMDEiLA0KICAgICAgImxheW91dCI6ICJib3R0b20iDQogICAgfSwNCiAgICAibWFyZ2luUmlnaHQiOiB7DQogICAgICAic2l6ZSI6ICItMTUiLA0KICAgICAgInJlZmVyZW5jZSI6ICIxMDAwMDEiLA0KICAgICAgImxheW91dCI6ICJyaWdodCINCiAgICB9LA0KICAgICJoZWlnaHQiOiB7DQogICAgICAic2l6ZSI6ICIxNSIsDQogICAgICAicmVmZXJlbmNlIjogIm93biIsDQogICAgICAibGF5b3V0IjogImhlaWdodCINCiAgICB9LA0KICAgICJ3aWR0aCI6IHsNCiAgICAgICJzaXplIjogIjUwJSIsDQogICAgICAicmVmZXJlbmNlIjogInN1cGVyIiwNCiAgICAgICJsYXlvdXQiOiAid2lkdGgiDQogICAgfSwNCiAgICAic3VwZXJWaWV3IjogIjEwMDAwMSIsDQogICAgImJnQ29sb3IiOiAiIzAwMDAwMDAwIiwNCiAgICAiY29udHJvbFR5cGUiOiAidGFnIiwNCiAgICAiZm9udFNpemUiOiA5LA0KICAgICJ0ZXh0Q29sb3IiOiAiIzAwMDAwMCIsDQogICAgInRleHRBbGlnbiI6ICJyaWdodCINCiAgfSwNCiAgew0KICAgICJ1aWQiOiAiMTQwMDAxIiwNCiAgICAibGF5ZXIiOiAyLA0KICAgICJtYXJnaW5Cb3R0b20iOiB7DQogICAgICAic2l6ZSI6ICItMTUiLA0KICAgICAgInJlZmVyZW5jZSI6ICIxMDAwMDEiLA0KICAgICAgImxheW91dCI6ICJib3R0b20iDQogICAgfSwNCiAgICAibWFyZ2luTGVmdCI6IHsNCiAgICAgICJzaXplIjogIjE1IiwNCiAgICAgICJyZWZlcmVuY2UiOiAiMTAwMDAxIiwNCiAgICAgICJsYXlvdXQiOiAibGVmdCINCiAgICB9LA0KICAgICJoZWlnaHQiOiB7DQogICAgICAic2l6ZSI6ICIxNSIsDQogICAgICAicmVmZXJlbmNlIjogIm93biIsDQogICAgICAibGF5b3V0IjogImhlaWdodCINCiAgICB9LA0KICAgICJ3aWR0aCI6IHsNCiAgICAgICJzaXplIjogIjEwMCIsDQogICAgICAicmVmZXJlbmNlIjogIm93biIsDQogICAgICAibGF5b3V0IjogIndpZHRoIg0KICAgIH0sDQogICAgInN1cGVyVmlldyI6ICIxMDAwMDEiLA0KICAgICJiZ0NvbG9yIjogIiM2Njg4ODg4OCIsDQogICAgImJvcmRlclJhZGl1cyI6IDIsDQogICAgImNvbnRyb2xUeXBlIjogImxvZ28iLA0KICAgICJ0aXRsZSI6ICLlub/lkYoiLA0KICAgICJmb250U2l6ZSI6IDksDQogICAgInRleHRDb2xvciI6ICIjREREREREIiwNCiAgICAidGV4dEFsaWduIjogImNlbnRlciINCiAgfSwNCiAgew0KICAgICJ1aWQiOiAiMTUwMDAxIiwNCiAgICAibGF5ZXIiOiA1LA0KICAgICJtYXJnaW5Ub3AiOiB7DQogICAgICAic2l6ZSI6ICIxMCIsDQogICAgICAicmVmZXJlbmNlIjogInN1cGVyIiwNCiAgICAgICJsYXlvdXQiOiAidG9wIg0KICAgIH0sDQogICAgIm1hcmdpbkxlZnQiOiB7DQogICAgICAic2l6ZSI6ICIxMCIsDQogICAgICAicmVmZXJlbmNlIjogInN1cGVyIiwNCiAgICAgICJsYXlvdXQiOiAibGVmdCINCiAgICB9LA0KICAgICJ3aWR0aCI6IHsNCiAgICAgICJzaXplIjogIjgwJSIsDQogICAgICAicmVmZXJlbmNlIjogInN1cGVyIiwNCiAgICAgICJsYXlvdXQiOiAid2lkdGgiDQogICAgfSwNCiAgICAic3VwZXJWaWV3IjogIjEwMDAwMSIsDQogICAgImJnQ29sb3IiOiAiIzAwMDAwMDAwIiwNCiAgICAiY29udHJvbFR5cGUiOiAiYXBwaW5mbyIsDQogICAgImJpbmRFdmVudCI6ICJjbGljayIsDQogICAgImV4ZWN1dGlvbiI6ICJhcHBpbmZvIiwNCiAgICAiZm9udFNpemUiOiAxMiwNCiAgICAidGV4dENvbG9yIjogIiM4ODg4ODgiLA0KICAgICJ0ZXh0QWxpZ24iOiAibGVmdCINCiAgfQ0KXQ=="
            return r3
        L1e:
            return r1
        L1f:
            java.lang.String r3 = "Ww0KICB7DQogICAgInVpZCI6ICIxMDAwMDEiLA0KICAgICJsYXllciI6IDEsDQogICAgIm1hcmdpblRvcCI6IHsNCiAgICAgICJzaXplIjogIjAiLA0KICAgICAgInJlZmVyZW5jZSI6ICJzdXBlciIsDQogICAgICAibGF5b3V0IjogInRvcCINCiAgICB9LA0KICAgICJtYXJnaW5MZWZ0Ijogew0KICAgICAgInNpemUiOiAiMCIsDQogICAgICAicmVmZXJlbmNlIjogInN1cGVyIiwNCiAgICAgICJsYXlvdXQiOiAibGVmdCINCiAgICB9LA0KICAgICJtYXJnaW5SaWdodCI6IHsNCiAgICAgICJzaXplIjogIjAiLA0KICAgICAgInJlZmVyZW5jZSI6ICJzdXBlciIsDQogICAgICAibGF5b3V0IjogInJpZ2h0Ig0KICAgIH0sDQogICAgIm1hcmdpbkJvdHRvbSI6IHsNCiAgICAgICJzaXplIjogIjAiLA0KICAgICAgInJlZmVyZW5jZSI6ICJzdXBlciIsDQogICAgICAibGF5b3V0IjogImJvdHRvbSINCiAgICB9LA0KICAgICJzdXBlclZpZXciOiAibm9uZSIsDQogICAgImJnQ29sb3IiOiAiIzgwMDAwMDAwIiwNCiAgICAiY29udHJvbFR5cGUiOiAidmlldyINCiAgfSwNCiAgew0KICAgICJ1aWQiOiAiMTEwMDAxIiwNCiAgICAibGF5ZXIiOiAxLA0KICAgICJtYXJnaW5MZWZ0Ijogew0KICAgICAgInNpemUiOiAiMTglIiwNCiAgICAgICJyZWZlcmVuY2UiOiAic3VwZXIiLA0KICAgICAgImxheW91dCI6ICJsZWZ0Ig0KICAgIH0sDQogICAgIm1hcmdpblJpZ2h0Ijogew0KICAgICAgInNpemUiOiAiLTE4JSIsDQogICAgICAicmVmZXJlbmNlIjogInN1cGVyIiwNCiAgICAgICJsYXlvdXQiOiAicmlnaHQiDQogICAgfSwNCiAgICAiaGVpZ2h0Ijogew0KICAgICAgInNpemUiOiAiMTc3JSIsDQogICAgICAicmVmZXJlbmNlIjogIm93biIsDQogICAgICAibGF5b3V0IjogIndpZHRoIg0KICAgIH0sDQogICAgImNlbnRlclkiOiB7DQogICAgICAic2l6ZSI6ICItMjUiLA0KICAgICAgInJlZmVyZW5jZSI6ICJzdXBlciIsDQogICAgICAibGF5b3V0IjogImNlbnRlclkiDQogICAgfSwNCiAgICAic3VwZXJWaWV3IjogIjEwMDAwMSIsDQogICAgImJnQ29sb3IiOiAiI0ZGRkZGRiIsDQogICAgImNvbnRyb2xUeXBlIjogInZpZXciLA0KICAgICJib3JkZXJSYWRpdXMiOiAiMTAiDQogIH0sDQogIHsNCiAgICAidWlkIjogIjEyMDAwMSIsDQogICAgImxheWVyIjogMSwNCiAgICAibWFyZ2luVG9wIjogew0KICAgICAgInNpemUiOiAiNSIsDQogICAgICAicmVmZXJlbmNlIjogInN1cGVyIiwNCiAgICAgICJsYXlvdXQiOiAidG9wIg0KICAgIH0sDQogICAgIm1hcmdpbkxlZnQiOiB7DQogICAgICAic2l6ZSI6ICI1IiwNCiAgICAgICJyZWZlcmVuY2UiOiAic3VwZXIiLA0KICAgICAgImxheW91dCI6ICJsZWZ0Ig0KICAgIH0sDQogICAgIm1hcmdpblJpZ2h0Ijogew0KICAgICAgInNpemUiOiAiLTUiLA0KICAgICAgInJlZmVyZW5jZSI6ICJzdXBlciIsDQogICAgICAibGF5b3V0IjogInJpZ2h0Ig0KICAgIH0sDQogICAgIm1hcmdpbkJvdHRvbSI6IHsNCiAgICAgICJzaXplIjogIi01IiwNCiAgICAgICJyZWZlcmVuY2UiOiAic3VwZXIiLA0KICAgICAgImxheW91dCI6ICJib3R0b20iDQogICAgfSwNCiAgICAic3VwZXJWaWV3IjogIjExMDAwMSIsDQogICAgImJnQ29sb3IiOiAiIzAwMDAwMDAwIiwNCiAgICAiY29udHJvbFR5cGUiOiAiaW1hZ2UiLA0KICAgICJib3JkZXJSYWRpdXMiOiAiNiIsDQogICAgImlzQmx1ciI6IDEsDQogICAgImFzc2V0SWQiOiAiMTAwMSINCiAgfSwNCiAgew0KICAgICJ1aWQiOiAiMTMwMDAxIiwNCiAgICAibGF5ZXIiOiAxMCwNCiAgICAibWFyZ2luVG9wIjogew0KICAgICAgInNpemUiOiAiMTAiLA0KICAgICAgInJlZmVyZW5jZSI6ICIxMjAwMDEiLA0KICAgICAgImxheW91dCI6ICJ0b3AiDQogICAgfSwNCiAgICAibWFyZ2luUmlnaHQiOiB7DQogICAgICAic2l6ZSI6ICItMTAiLA0KICAgICAgInJlZmVyZW5jZSI6ICIxMjAwMDEiLA0KICAgICAgImxheW91dCI6ICJyaWdodCINCiAgICB9LA0KICAgICJoZWlnaHQiOiB7DQogICAgICAic2l6ZSI6ICIyMiIsDQogICAgICAicmVmZXJlbmNlIjogIm93biIsDQogICAgICAibGF5b3V0IjogImhlaWdodCINCiAgICB9LA0KICAgICJ3aWR0aCI6IHsNCiAgICAgICJzaXplIjogIjYwIiwNCiAgICAgICJyZWZlcmVuY2UiOiAib3duIiwNCiAgICAgICJsYXlvdXQiOiAid2lkdGgiDQogICAgfSwNCiAgICAic3VwZXJWaWV3IjogIjExMDAwMSIsDQogICAgImJnQ29sb3IiOiAiIzY2MzMzMzMzIiwNCiAgICAiYm9yZGVyUmFkaXVzIjogIjUwJSIsDQogICAgImNvbnRyb2xUeXBlIjogImNvdW50ZG93bmNsb3NlIiwNCiAgICAiYXV0b0Nsb3NlIjogMCwNCiAgICAiYmluZEV2ZW50IjogImNsaWNrIiwNCiAgICAiZXhlY3V0aW9uIjogImNsb3NlIiwNCiAgICAidGl0bGUiOiAi5YWz6ZetIiwNCiAgICAiZm9udFNpemUiOiAxMiwNCiAgICAidGV4dENvbG9yIjogIiNGRkZGRkYiLA0KICAgICJ0ZXh0QWxpZ24iOiAiY2VudGVyIiwNCiAgICAiY291bnREb3duVGltZSI6IDEwMDAwDQogIH0sDQogIHsNCiAgICAidWlkIjogIjE0MDAwMSIsDQogICAgImxheWVyIjogMiwNCiAgICAibWFyZ2luQm90dG9tIjogew0KICAgICAgInNpemUiOiAiLTE1IiwNCiAgICAgICJyZWZlcmVuY2UiOiAiMTIwMDAxIiwNCiAgICAgICJsYXlvdXQiOiAiYm90dG9tIg0KICAgIH0sDQogICAgIm1hcmdpblJpZ2h0Ijogew0KICAgICAgInNpemUiOiAiLTIyIiwNCiAgICAgICJyZWZlcmVuY2UiOiAiMTIwMDAxIiwNCiAgICAgICJsYXlvdXQiOiAicmlnaHQiDQogICAgfSwNCiAgICAiaGVpZ2h0Ijogew0KICAgICAgInNpemUiOiAiMTUiLA0KICAgICAgInJlZmVyZW5jZSI6ICJvd24iLA0KICAgICAgImxheW91dCI6ICJoZWlnaHQiDQogICAgfSwNCiAgICAid2lkdGgiOiB7DQogICAgICAic2l6ZSI6ICI1MCUiLA0KICAgICAgInJlZmVyZW5jZSI6ICJzdXBlciIsDQogICAgICAibGF5b3V0IjogIndpZHRoIg0KICAgIH0sDQogICAgInN1cGVyVmlldyI6ICIxMTAwMDEiLA0KICAgICJiZ0NvbG9yIjogIiMwMDAwMDAwMCIsDQogICAgImNvbnRyb2xUeXBlIjogInRhZyIsDQogICAgImZvbnRTaXplIjogOSwNCiAgICAidGV4dENvbG9yIjogIiMwMDAwMDAiLA0KICAgICJ0ZXh0QWxpZ24iOiAicmlnaHQiDQogIH0sDQogIHsNCiAgICAidWlkIjogIjE1MDAwMSIsDQogICAgImxheWVyIjogMiwNCiAgICAibWFyZ2luQm90dG9tIjogew0KICAgICAgInNpemUiOiAiLTIwIiwNCiAgICAgICJyZWZlcmVuY2UiOiAic3VwZXIiLA0KICAgICAgImxheW91dCI6ICJib3R0b20iDQogICAgfSwNCiAgICAibWFyZ2luTGVmdCI6IHsNCiAgICAgICJzaXplIjogIjIwIiwNCiAgICAgICJyZWZlcmVuY2UiOiAic3VwZXIiLA0KICAgICAgImxheW91dCI6ICJsZWZ0Ig0KICAgIH0sDQogICAgImhlaWdodCI6IHsNCiAgICAgICJzaXplIjogIjIwIiwNCiAgICAgICJyZWZlcmVuY2UiOiAib3duIiwNCiAgICAgICJsYXlvdXQiOiAiaGVpZ2h0Ig0KICAgIH0sDQogICAgIndpZHRoIjogew0KICAgICAgInNpemUiOiAiMTAwIiwNCiAgICAgICJyZWZlcmVuY2UiOiAib3duIiwNCiAgICAgICJsYXlvdXQiOiAid2lkdGgiDQogICAgfSwNCiAgICAic3VwZXJWaWV3IjogIjExMDAwMSIsDQogICAgImJnQ29sb3IiOiAiIzY2ODg4ODg4IiwNCiAgICAiYm9yZGVyUmFkaXVzIjogMiwNCiAgICAiY29udHJvbFR5cGUiOiAibG9nbyIsDQogICAgInRpdGxlIjogIuW5v+WRiiIsDQogICAgImZvbnRTaXplIjogOSwNCiAgICAidGV4dENvbG9yIjogIiNEREREREQiLA0KICAgICJ0ZXh0QWxpZ24iOiAiY2VudGVyIg0KICB9LA0KICB7DQogICAgInVpZCI6ICIxNjAwMDEiLA0KICAgICJsYXllciI6IDIsDQogICAgIm1hcmdpbkxlZnQiOiB7DQogICAgICAic2l6ZSI6ICIwIiwNCiAgICAgICJyZWZlcmVuY2UiOiAiMTEwMDAxIiwNCiAgICAgICJsYXlvdXQiOiAibGVmdCINCiAgICB9LA0KICAgICJtYXJnaW5SaWdodCI6IHsNCiAgICAgICJzaXplIjogIjAiLA0KICAgICAgInJlZmVyZW5jZSI6ICIxMTAwMDEiLA0KICAgICAgImxheW91dCI6ICJyaWdodCINCiAgICB9LA0KICAgICJtYXJnaW5Ub3AiOiB7DQogICAgICAic2l6ZSI6ICIxMCIsDQogICAgICAicmVmZXJlbmNlIjogIjExMDAwMSIsDQogICAgICAibGF5b3V0IjogImJvdHRvbSINCiAgICB9LA0KICAgICJoZWlnaHQiOiB7DQogICAgICAic2l6ZSI6ICI0MCIsDQogICAgICAicmVmZXJlbmNlIjogIm93biIsDQogICAgICAibGF5b3V0IjogImhlaWdodCINCiAgICB9LA0KICAgICJzdXBlclZpZXciOiAiMTAwMDAxIiwNCiAgICAiYmdDb2xvciI6ICIjMzk3NkZGIiwNCiAgICAiYm9yZGVyUmFkaXVzIjogIjEwIiwNCiAgICAiY29udHJvbFR5cGUiOiAicmVnaW9uIiwNCiAgICAiYmluZEV2ZW50IjogImNsaWNrIiwNCiAgICAiZXhlY3V0aW9uIjogImNsaWNrIiwNCiAgICAiZm9udFNpemUiOiAxNywNCiAgICAidGV4dENvbG9yIjogIiNGRkZGRkYiLA0KICAgICJ0ZXh0QWxpZ24iOiAiY2VudGVyIiwNCiAgICAiaW50ZXJhY3RpdmVUaXRsZSI6IHsNCiAgICAgICJub3JtYWwiOiB7DQogICAgICAgICJub3JtYWwiOiAi54K55Ye76Lez6L2s6Iez56ys5LiJ5pa55oiW6K+m5oOFIiwNCiAgICAgICAgInBhc3NpdmF0aW9uIjogIueCueWHu+i3s+i9rOiHs+esrOS4ieaWueaIluivpuaDhSIsDQogICAgICAgICJjb29sIjogIueCueWHu+i3s+i9rOiHs+esrOS4ieaWueaIluivpuaDhSINCiAgICAgIH0NCiAgICB9DQogIH0sDQogIHsNCiAgICAidWlkIjogIjE3MDAwMSIsDQogICAgImxheWVyIjogNSwNCiAgICAibWFyZ2luQm90dG9tIjogew0KICAgICAgInNpemUiOiAiLTIwIiwNCiAgICAgICJyZWZlcmVuY2UiOiAic3VwZXIiLA0KICAgICAgImxheW91dCI6ICJib3R0b20iDQogICAgfSwNCiAgICAibWFyZ2luTGVmdCI6IHsNCiAgICAgICJzaXplIjogIjIwIiwNCiAgICAgICJyZWZlcmVuY2UiOiAic3VwZXIiLA0KICAgICAgImxheW91dCI6ICJsZWZ0Ig0KICAgIH0sDQogICAgIm1hcmdpblJpZ2h0Ijogew0KICAgICAgInNpemUiOiAiLTIwIiwNCiAgICAgICJyZWZlcmVuY2UiOiAic3VwZXIiLA0KICAgICAgImxheW91dCI6ICJyaWdodCINCiAgICB9LA0KICAgICJzdXBlclZpZXciOiAiMTAwMDAxIiwNCiAgICAiYmdDb2xvciI6ICIjMDAwMDAwMDAiLA0KICAgICJjb250cm9sVHlwZSI6ICJhcHBpbmZvIiwNCiAgICAiYmluZEV2ZW50IjogImNsaWNrIiwNCiAgICAiZXhlY3V0aW9uIjogImFwcGluZm8iLA0KICAgICJmb250U2l6ZSI6IDEyLA0KICAgICJ0ZXh0Q29sb3IiOiAiIzMzMzMzMyIsDQogICAgInRleHRBbGlnbiI6ICJsZWZ0Ig0KICB9DQpd"
            return r3
        L22:
            java.lang.String r3 = "Ww0KICB7DQogICAgInVpZCI6ICIxMDAwMDEiLA0KICAgICJsYXllciI6IDEsDQogICAgIm1hcmdpblRvcCI6IHsNCiAgICAgICJzaXplIjogIjAiLA0KICAgICAgInJlZmVyZW5jZSI6ICJzdXBlciIsDQogICAgICAibGF5b3V0IjogInRvcCINCiAgICB9LA0KICAgICJtYXJnaW5MZWZ0Ijogew0KICAgICAgInNpemUiOiAiMCIsDQogICAgICAicmVmZXJlbmNlIjogInN1cGVyIiwNCiAgICAgICJsYXlvdXQiOiAibGVmdCINCiAgICB9LA0KICAgICJtYXJnaW5SaWdodCI6IHsNCiAgICAgICJzaXplIjogIjAiLA0KICAgICAgInJlZmVyZW5jZSI6ICJzdXBlciIsDQogICAgICAibGF5b3V0IjogInJpZ2h0Ig0KICAgIH0sDQogICAgIm1hcmdpbkJvdHRvbSI6IHsNCiAgICAgICJzaXplIjogIjAiLA0KICAgICAgInJlZmVyZW5jZSI6ICJzdXBlciIsDQogICAgICAibGF5b3V0IjogImJvdHRvbSINCiAgICB9LA0KICAgICJzdXBlclZpZXciOiAibm9uZSIsDQogICAgImJnQ29sb3IiOiAiIzAwMDAwMDAwIiwNCiAgICAiY29udHJvbFR5cGUiOiAidmlldyINCiAgfSwNCiAgew0KICAgICJ1aWQiOiAiMTEwMDAxIiwNCiAgICAibGF5ZXIiOiAxLA0KICAgICJtYXJnaW5Ub3AiOiB7DQogICAgICAic2l6ZSI6ICIwIiwNCiAgICAgICJyZWZlcmVuY2UiOiAic3VwZXIiLA0KICAgICAgImxheW91dCI6ICJ0b3AiDQogICAgfSwNCiAgICAibWFyZ2luTGVmdCI6IHsNCiAgICAgICJzaXplIjogIjAiLA0KICAgICAgInJlZmVyZW5jZSI6ICJzdXBlciIsDQogICAgICAibGF5b3V0IjogImxlZnQiDQogICAgfSwNCiAgICAibWFyZ2luUmlnaHQiOiB7DQogICAgICAic2l6ZSI6ICIwIiwNCiAgICAgICJyZWZlcmVuY2UiOiAic3VwZXIiLA0KICAgICAgImxheW91dCI6ICJyaWdodCINCiAgICB9LA0KICAgICJtYXJnaW5Cb3R0b20iOiB7DQogICAgICAic2l6ZSI6ICIwIiwNCiAgICAgICJyZWZlcmVuY2UiOiAic3VwZXIiLA0KICAgICAgImxheW91dCI6ICJib3R0b20iDQogICAgfSwNCiAgICAic3VwZXJWaWV3IjogIjEwMDAwMSIsDQogICAgImJnQ29sb3IiOiAiIzAwMDAwMDAwIiwNCiAgICAiY29udHJvbFR5cGUiOiAiaW1hZ2UiLA0KICAgICJpc0JsdXIiOiAxLA0KICAgICJhc3NldElkIjogIjEwMDEiDQogIH0sDQogIHsNCiAgICAidWlkIjogIjEyMDAwMSIsDQogICAgImxheWVyIjogMTAsDQogICAgIm1hcmdpblRvcCI6IHsNCiAgICAgICJzaXplIjogIjEwJSIsDQogICAgICAicmVmZXJlbmNlIjogInN1cGVyIiwNCiAgICAgICJsYXlvdXQiOiAidG9wIg0KICAgIH0sDQogICAgIm1hcmdpblJpZ2h0Ijogew0KICAgICAgInNpemUiOiAiLTUlIiwNCiAgICAgICJyZWZlcmVuY2UiOiAic3VwZXIiLA0KICAgICAgImxheW91dCI6ICJyaWdodCINCiAgICB9LA0KICAgICJoZWlnaHQiOiB7DQogICAgICAic2l6ZSI6ICIzMCIsDQogICAgICAicmVmZXJlbmNlIjogIm93biIsDQogICAgICAibGF5b3V0IjogImhlaWdodCINCiAgICB9LA0KICAgICJ3aWR0aCI6IHsNCiAgICAgICJzaXplIjogIjcwIiwNCiAgICAgICJyZWZlcmVuY2UiOiAib3duIiwNCiAgICAgICJsYXlvdXQiOiAid2lkdGgiDQogICAgfSwNCiAgICAic3VwZXJWaWV3IjogIjEwMDAwMSIsDQogICAgImJnQ29sb3IiOiAiIzY2ODg4ODg4IiwNCiAgICAiYm9yZGVyUmFkaXVzIjogIjUwJSIsDQogICAgImJvcmRlclNpemUiOiAiMSIsDQogICAgImJvcmRlckNvbG9yIjogIiNDQzg4ODg4OCIsDQogICAgImNvbnRyb2xUeXBlIjogImNhcHN1bGVjbG9zZSIsDQogICAgImJpbmRFdmVudCI6ICJjbGljayIsDQogICAgImV4ZWN1dGlvbiI6ICJjbG9zZSIsDQogICAgInRpdGxlIjogIui3s+i/hyIsDQogICAgImZvbnRTaXplIjogMTUsDQogICAgInRleHRDb2xvciI6ICIjRkZGRkZGIiwNCiAgICAidGV4dEFsaWduIjogImNlbnRlciIsDQogICAgImNvdW50RG93blRpbWUiOiA1MDAwDQogIH0sDQogIHsNCiAgICAidWlkIjogIjEzMDAwMSIsDQogICAgImxheWVyIjogMywNCiAgICAibWFyZ2luVG9wIjogew0KICAgICAgInNpemUiOiAiNSUiLA0KICAgICAgInJlZmVyZW5jZSI6ICJzdXBlciIsDQogICAgICAibGF5b3V0IjogInRvcCINCiAgICB9LA0KICAgICJtYXJnaW5MZWZ0Ijogew0KICAgICAgInNpemUiOiAiMjAiLA0KICAgICAgInJlZmVyZW5jZSI6ICJzdXBlciIsDQogICAgICAibGF5b3V0IjogImxlZnQiDQogICAgfSwNCiAgICAiaGVpZ2h0Ijogew0KICAgICAgInNpemUiOiAiMTUiLA0KICAgICAgInJlZmVyZW5jZSI6ICJvd24iLA0KICAgICAgImxheW91dCI6ICJoZWlnaHQiDQogICAgfSwNCiAgICAid2lkdGgiOiB7DQogICAgICAic2l6ZSI6ICI1MCUiLA0KICAgICAgInJlZmVyZW5jZSI6ICJzdXBlciIsDQogICAgICAibGF5b3V0IjogIndpZHRoIg0KICAgIH0sDQogICAgInN1cGVyVmlldyI6ICIxMDAwMDEiLA0KICAgICJiZ0NvbG9yIjogIiMwMDAwMDAwMCIsDQogICAgImNvbnRyb2xUeXBlIjogInRhZyIsDQogICAgImZvbnRTaXplIjogOSwNCiAgICAidGV4dENvbG9yIjogIiMwMDAwMDAiLA0KICAgICJ0ZXh0QWxpZ24iOiAibGVmdCINCiAgfSwNCiAgew0KICAgICJ1aWQiOiAiMTQwMDAxIiwNCiAgICAibGF5ZXIiOiAzLA0KICAgICJtYXJnaW5Cb3R0b20iOiB7DQogICAgICAic2l6ZSI6ICItMjAiLA0KICAgICAgInJlZmVyZW5jZSI6ICJzdXBlciIsDQogICAgICAibGF5b3V0IjogImJvdHRvbSINCiAgICB9LA0KICAgICJtYXJnaW5SaWdodCI6IHsNCiAgICAgICJzaXplIjogIi0yMCIsDQogICAgICAicmVmZXJlbmNlIjogInN1cGVyIiwNCiAgICAgICJsYXlvdXQiOiAicmlnaHQiDQogICAgfSwNCiAgICAiaGVpZ2h0Ijogew0KICAgICAgInNpemUiOiAiMjAiLA0KICAgICAgInJlZmVyZW5jZSI6ICJvd24iLA0KICAgICAgImxheW91dCI6ICJoZWlnaHQiDQogICAgfSwNCiAgICAid2lkdGgiOiB7DQogICAgICAic2l6ZSI6ICIxMDAiLA0KICAgICAgInJlZmVyZW5jZSI6ICJvd24iLA0KICAgICAgImxheW91dCI6ICJ3aWR0aCINCiAgICB9LA0KICAgICJzdXBlclZpZXciOiAiMTAwMDAxIiwNCiAgICAiYmdDb2xvciI6ICIjNjY4ODg4ODgiLA0KICAgICJib3JkZXJSYWRpdXMiOiAyLA0KICAgICJjb250cm9sVHlwZSI6ICJsb2dvIiwNCiAgICAidGl0bGUiOiAi5bm/5ZGKIiwNCiAgICAiZm9udFNpemUiOiA5LA0KICAgICJ0ZXh0Q29sb3IiOiAiI0RERERERCIsDQogICAgInRleHRBbGlnbiI6ICJjZW50ZXIiDQogIH0sDQogIHsNCiAgICAidWlkIjogIjE1MDAwMSIsDQogICAgImxheWVyIjogNCwNCiAgICAibWFyZ2luTGVmdCI6IHsNCiAgICAgICJzaXplIjogIjglIiwNCiAgICAgICJyZWZlcmVuY2UiOiAic3VwZXIiLA0KICAgICAgImxheW91dCI6ICJsZWZ0Ig0KICAgIH0sDQogICAgIm1hcmdpblJpZ2h0Ijogew0KICAgICAgInNpemUiOiAiLTglIiwNCiAgICAgICJyZWZlcmVuY2UiOiAic3VwZXIiLA0KICAgICAgImxheW91dCI6ICJyaWdodCINCiAgICB9LA0KICAgICJtYXJnaW5Cb3R0b20iOiB7DQogICAgICAic2l6ZSI6ICItMjAlIiwNCiAgICAgICJyZWZlcmVuY2UiOiAic3VwZXIiLA0KICAgICAgImxheW91dCI6ICJib3R0b20iDQogICAgfSwNCiAgICAiaGVpZ2h0Ijogew0KICAgICAgInNpemUiOiAiODAiLA0KICAgICAgInJlZmVyZW5jZSI6ICJvd24iLA0KICAgICAgImxheW91dCI6ICJoZWlnaHQiDQogICAgfSwNCiAgICAic3VwZXJWaWV3IjogIjEwMDAwMSIsDQogICAgImJnQ29sb3IiOiAiIzY2ODg4ODg4IiwNCiAgICAiYm9yZGVyUmFkaXVzIjogIjUwJSIsDQogICAgImJvcmRlclNpemUiOiAiMSIsDQogICAgImJvcmRlckNvbG9yIjogIiNDQzg4ODg4OCIsDQogICAgImNvbnRyb2xUeXBlIjogInJlZ2lvbiIsDQogICAgImJpbmRFdmVudCI6ICJjbGljayIsDQogICAgImV4ZWN1dGlvbiI6ICJjbGljayIsDQogICAgImZvbnRTaXplIjogMjAsDQogICAgInRleHRDb2xvciI6ICIjRkZGRkZGIiwNCiAgICAidGV4dEFsaWduIjogImNlbnRlciIsDQogICAgImludGVyYWN0aXZlVGl0bGUiOiB7DQogICAgICAibm9ybWFsIjogew0KICAgICAgICAibm9ybWFsIjogIueCueWHu+i3s+i9rOiHs+esrOS4ieaWueaIluivpuaDhSIsDQogICAgICAgICJwYXNzaXZhdGlvbiI6ICLngrnlh7vot7Povazoh7PnrKzkuInmlrnmiJbor6bmg4UiLA0KICAgICAgICAiY29vbCI6ICLngrnlh7vot7Povazoh7PnrKzkuInmlrnmiJbor6bmg4UiDQogICAgICB9DQogICAgfQ0KICB9LA0KICB7DQogICAgInVpZCI6ICIxNjAwMDEiLA0KICAgICJsYXllciI6IDUsDQogICAgIm1hcmdpbkJvdHRvbSI6IHsNCiAgICAgICJzaXplIjogIi0yMCIsDQogICAgICAicmVmZXJlbmNlIjogInN1cGVyIiwNCiAgICAgICJsYXlvdXQiOiAiYm90dG9tIg0KICAgIH0sDQogICAgIm1hcmdpbkxlZnQiOiB7DQogICAgICAic2l6ZSI6ICIyMCIsDQogICAgICAicmVmZXJlbmNlIjogInN1cGVyIiwNCiAgICAgICJsYXlvdXQiOiAibGVmdCINCiAgICB9LA0KICAgICJ3aWR0aCI6IHsNCiAgICAgICJzaXplIjogIjcwJSIsDQogICAgICAicmVmZXJlbmNlIjogInN1cGVyIiwNCiAgICAgICJsYXlvdXQiOiAid2lkdGgiDQogICAgfSwNCiAgICAic3VwZXJWaWV3IjogIjEwMDAwMSIsDQogICAgImJnQ29sb3IiOiAiIzAwMDAwMDAwIiwNCiAgICAiY29udHJvbFR5cGUiOiAiYXBwaW5mbyIsDQogICAgImJpbmRFdmVudCI6ICJjbGljayIsDQogICAgImV4ZWN1dGlvbiI6ICJhcHBpbmZvIiwNCiAgICAiZm9udFNpemUiOiAxMiwNCiAgICAidGV4dENvbG9yIjogIiM4ODg4ODgiLA0KICAgICJ0ZXh0QWxpZ24iOiAibGVmdCINCiAgfQ0KXQ=="
            return r3
    }

    private java.lang.String b(java.lang.String r4) {
            r3 = this;
            android.content.Context r0 = r3.b
            java.lang.String r1 = "default"
            java.lang.String r2 = ""
            java.lang.String r4 = xyz.adscope.ad.i0.a(r0, r4, r1, r2)
            return r4
    }

    public java.util.List<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel> a(xyz.adscope.ad.c r5, java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = r5.c()
            java.lang.String r0 = r4.a(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            r2 = 0
            if (r1 != 0) goto L22
            android.content.Context r1 = r4.b
            java.lang.String r3 = ""
            java.lang.String r6 = xyz.adscope.ad.i0.a(r1, r0, r6, r3)
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 == 0) goto L23
            java.lang.String r6 = r4.b(r0)
            goto L23
        L22:
            r6 = r2
        L23:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L2d
            java.lang.String r6 = r4.a(r5)
        L2d:
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L61
            java.lang.String r5 = xyz.adscope.common.v2.encrypt.impl.Base64Util.decodeToString(r6)
            if (r5 == 0) goto L61
            org.json.JSONArray r5 = xyz.adscope.common.v2.tool.json.JsonUtil.parseJSONArray(r5)
            if (r5 == 0) goto L61
            int r6 = r5.length()
            if (r6 <= 0) goto L61
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0 = 0
        L4b:
            int r1 = r5.length()     // Catch: org.json.JSONException -> L61
            if (r0 >= r1) goto L60
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r1 = new xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel     // Catch: org.json.JSONException -> L61
            org.json.JSONObject r3 = r5.getJSONObject(r0)     // Catch: org.json.JSONException -> L61
            r1.<init>(r3)     // Catch: org.json.JSONException -> L61
            r6.add(r1)     // Catch: org.json.JSONException -> L61
            int r0 = r0 + 1
            goto L4b
        L60:
            return r6
        L61:
            return r2
    }

    public void a(java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.temp.TemplateModel> r5) {
            r4 = this;
            if (r5 == 0) goto L2c
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L2c
            java.util.Iterator r5 = r5.iterator()
        Lc:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r5.next()
            xyz.adscope.ad.model.impl.resp.cfg.root.temp.TemplateModel r0 = (xyz.adscope.ad.model.impl.resp.cfg.root.temp.TemplateModel) r0
            android.content.Context r1 = r4.b
            java.lang.String r2 = r0.a()
            java.lang.String r2 = r4.a(r2)
            java.lang.String r0 = r0.b()
            java.lang.String r3 = "default"
            xyz.adscope.ad.i0.b(r1, r2, r3, r0)
            goto Lc
        L2c:
            return
    }

    public void a(xyz.adscope.ad.c r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r4 = xyz.adscope.common.v2.encrypt.impl.Base64Util.encodeToString(r4)
            android.content.Context r0 = r1.b
            java.lang.String r2 = r2.c()
            java.lang.String r2 = r1.a(r2)
            xyz.adscope.ad.i0.b(r0, r2, r3, r4)
            return
    }

    public java.util.List<java.lang.String> b(xyz.adscope.ad.c r3) {
            r2 = this;
            android.content.Context r0 = r2.b
            java.lang.String r3 = r3.c()
            java.lang.String r3 = r2.a(r3)
            java.util.Map r3 = xyz.adscope.ad.i0.a(r0, r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L22
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L22
            java.util.Set r3 = r3.keySet()
            r0.addAll(r3)
        L22:
            return r0
    }
}
