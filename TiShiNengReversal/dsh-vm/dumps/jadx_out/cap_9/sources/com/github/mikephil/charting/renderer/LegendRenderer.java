package com.github.mikephil.charting.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class LegendRenderer extends com.github.mikephil.charting.renderer.Renderer {
    protected java.util.List<com.github.mikephil.charting.components.LegendEntry> computedEntries;
    protected android.graphics.Paint.FontMetrics legendFontMetrics;
    protected com.github.mikephil.charting.components.Legend mLegend;
    protected android.graphics.Paint mLegendFormPaint;
    protected android.graphics.Paint mLegendLabelPaint;
    private android.graphics.Path mLineFormPath;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.github.mikephil.charting.renderer.LegendRenderer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm = null;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment = null;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation = null;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment = null;

        static {
                com.github.mikephil.charting.components.Legend$LegendForm[] r0 = com.github.mikephil.charting.components.Legend.LegendForm.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.github.mikephil.charting.renderer.LegendRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm = r0
                r1 = 1
                com.github.mikephil.charting.components.Legend$LegendForm r2 = com.github.mikephil.charting.components.Legend.LegendForm.NONE     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = com.github.mikephil.charting.renderer.LegendRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm     // Catch: java.lang.NoSuchFieldError -> L1d
                com.github.mikephil.charting.components.Legend$LegendForm r3 = com.github.mikephil.charting.components.Legend.LegendForm.EMPTY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = com.github.mikephil.charting.renderer.LegendRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm     // Catch: java.lang.NoSuchFieldError -> L28
                com.github.mikephil.charting.components.Legend$LegendForm r4 = com.github.mikephil.charting.components.Legend.LegendForm.DEFAULT     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r3 = com.github.mikephil.charting.renderer.LegendRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm     // Catch: java.lang.NoSuchFieldError -> L33
                com.github.mikephil.charting.components.Legend$LegendForm r4 = com.github.mikephil.charting.components.Legend.LegendForm.CIRCLE     // Catch: java.lang.NoSuchFieldError -> L33
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r5 = 4
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r3 = com.github.mikephil.charting.renderer.LegendRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm     // Catch: java.lang.NoSuchFieldError -> L3e
                com.github.mikephil.charting.components.Legend$LegendForm r4 = com.github.mikephil.charting.components.Legend.LegendForm.SQUARE     // Catch: java.lang.NoSuchFieldError -> L3e
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r5 = 5
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r3 = com.github.mikephil.charting.renderer.LegendRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm     // Catch: java.lang.NoSuchFieldError -> L49
                com.github.mikephil.charting.components.Legend$LegendForm r4 = com.github.mikephil.charting.components.Legend.LegendForm.LINE     // Catch: java.lang.NoSuchFieldError -> L49
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r5 = 6
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                com.github.mikephil.charting.components.Legend$LegendOrientation[] r3 = com.github.mikephil.charting.components.Legend.LegendOrientation.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.github.mikephil.charting.renderer.LegendRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation = r3
                com.github.mikephil.charting.components.Legend$LegendOrientation r4 = com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL     // Catch: java.lang.NoSuchFieldError -> L5a
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5a
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L5a
            L5a:
                int[] r3 = com.github.mikephil.charting.renderer.LegendRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation     // Catch: java.lang.NoSuchFieldError -> L64
                com.github.mikephil.charting.components.Legend$LegendOrientation r4 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL     // Catch: java.lang.NoSuchFieldError -> L64
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L64
                r3[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L64
            L64:
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment[] r3 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.github.mikephil.charting.renderer.LegendRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment = r3
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r4 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP     // Catch: java.lang.NoSuchFieldError -> L75
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L75
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L75
            L75:
                int[] r3 = com.github.mikephil.charting.renderer.LegendRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment     // Catch: java.lang.NoSuchFieldError -> L7f
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r4 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM     // Catch: java.lang.NoSuchFieldError -> L7f
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7f
                r3[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L7f
            L7f:
                int[] r3 = com.github.mikephil.charting.renderer.LegendRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment     // Catch: java.lang.NoSuchFieldError -> L89
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r4 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.CENTER     // Catch: java.lang.NoSuchFieldError -> L89
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L89
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L89
            L89:
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment[] r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.github.mikephil.charting.renderer.LegendRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment = r3
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r4 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT     // Catch: java.lang.NoSuchFieldError -> L9a
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9a
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L9a
            L9a:
                int[] r1 = com.github.mikephil.charting.renderer.LegendRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment     // Catch: java.lang.NoSuchFieldError -> La4
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT     // Catch: java.lang.NoSuchFieldError -> La4
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> La4
                r1[r3] = r0     // Catch: java.lang.NoSuchFieldError -> La4
            La4:
                int[] r0 = com.github.mikephil.charting.renderer.LegendRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment     // Catch: java.lang.NoSuchFieldError -> Lae
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r1 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER     // Catch: java.lang.NoSuchFieldError -> Lae
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lae
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lae
            Lae:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public LegendRenderer(com.github.mikephil.charting.utils.ViewPortHandler r2, com.github.mikephil.charting.components.Legend r3) {
            r1 = this;
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 16
            r2.<init>(r0)
            r1.computedEntries = r2
            android.graphics.Paint$FontMetrics r2 = new android.graphics.Paint$FontMetrics
            r2.<init>()
            r1.legendFontMetrics = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r1.mLineFormPath = r2
            r1.mLegend = r3
            android.graphics.Paint r2 = new android.graphics.Paint
            r3 = 1
            r2.<init>(r3)
            r1.mLegendLabelPaint = r2
            r0 = 1091567616(0x41100000, float:9.0)
            float r0 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            r2.setTextSize(r0)
            android.graphics.Paint r2 = r1.mLegendLabelPaint
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.LEFT
            r2.setTextAlign(r0)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>(r3)
            r1.mLegendFormPaint = r2
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            return
    }

    public void computeLegend(com.github.mikephil.charting.data.ChartData<?> r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            com.github.mikephil.charting.components.Legend r2 = r0.mLegend
            boolean r2 = r2.isLegendCustom()
            if (r2 != 0) goto L1a9
            java.util.List<com.github.mikephil.charting.components.LegendEntry> r2 = r0.computedEntries
            r2.clear()
            r2 = 0
            r3 = 0
        L13:
            int r4 = r1.getDataSetCount()
            if (r3 >= r4) goto L18f
            com.github.mikephil.charting.interfaces.datasets.IDataSet r4 = r1.getDataSetByIndex(r3)
            java.util.List r5 = r4.getColors()
            int r6 = r4.getEntryCount()
            boolean r7 = r4 instanceof com.github.mikephil.charting.interfaces.datasets.IBarDataSet
            if (r7 == 0) goto L8f
            r7 = r4
            com.github.mikephil.charting.interfaces.datasets.IBarDataSet r7 = (com.github.mikephil.charting.interfaces.datasets.IBarDataSet) r7
            boolean r8 = r7.isStacked()
            if (r8 == 0) goto L8f
            java.lang.String[] r6 = r7.getStackLabels()
            r8 = 0
        L37:
            int r9 = r5.size()
            if (r8 >= r9) goto L6f
            int r9 = r7.getStackSize()
            if (r8 >= r9) goto L6f
            java.util.List<com.github.mikephil.charting.components.LegendEntry> r9 = r0.computedEntries
            com.github.mikephil.charting.components.LegendEntry r10 = new com.github.mikephil.charting.components.LegendEntry
            int r11 = r6.length
            int r11 = r8 % r11
            r11 = r6[r11]
            com.github.mikephil.charting.components.Legend$LegendForm r12 = r4.getForm()
            float r13 = r4.getFormSize()
            float r14 = r4.getFormLineWidth()
            android.graphics.DashPathEffect r15 = r4.getFormLineDashEffect()
            java.lang.Object r16 = r5.get(r8)
            java.lang.Integer r16 = (java.lang.Integer) r16
            int r16 = r16.intValue()
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r9.add(r10)
            int r8 = r8 + 1
            goto L37
        L6f:
            java.lang.String r5 = r7.getLabel()
            if (r5 == 0) goto L18b
            java.util.List<com.github.mikephil.charting.components.LegendEntry> r5 = r0.computedEntries
            com.github.mikephil.charting.components.LegendEntry r6 = new com.github.mikephil.charting.components.LegendEntry
            java.lang.String r7 = r4.getLabel()
            com.github.mikephil.charting.components.Legend$LegendForm r8 = com.github.mikephil.charting.components.Legend.LegendForm.NONE
            r11 = 0
            r12 = 1122867(0x112233, float:1.573472E-39)
            r9 = 2143289344(0x7fc00000, float:NaN)
            r10 = 2143289344(0x7fc00000, float:NaN)
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r5.add(r6)
            goto L18b
        L8f:
            boolean r7 = r4 instanceof com.github.mikephil.charting.interfaces.datasets.IPieDataSet
            if (r7 == 0) goto Lf0
            r7 = r4
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet r7 = (com.github.mikephil.charting.interfaces.datasets.IPieDataSet) r7
            r8 = 0
        L97:
            int r9 = r5.size()
            if (r8 >= r9) goto Ld0
            if (r8 >= r6) goto Ld0
            java.util.List<com.github.mikephil.charting.components.LegendEntry> r9 = r0.computedEntries
            com.github.mikephil.charting.components.LegendEntry r10 = new com.github.mikephil.charting.components.LegendEntry
            com.github.mikephil.charting.data.Entry r11 = r7.getEntryForIndex(r8)
            com.github.mikephil.charting.data.PieEntry r11 = (com.github.mikephil.charting.data.PieEntry) r11
            java.lang.String r11 = r11.getLabel()
            com.github.mikephil.charting.components.Legend$LegendForm r12 = r4.getForm()
            float r13 = r4.getFormSize()
            float r14 = r4.getFormLineWidth()
            android.graphics.DashPathEffect r15 = r4.getFormLineDashEffect()
            java.lang.Object r16 = r5.get(r8)
            java.lang.Integer r16 = (java.lang.Integer) r16
            int r16 = r16.intValue()
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r9.add(r10)
            int r8 = r8 + 1
            goto L97
        Ld0:
            java.lang.String r5 = r7.getLabel()
            if (r5 == 0) goto L18b
            java.util.List<com.github.mikephil.charting.components.LegendEntry> r5 = r0.computedEntries
            com.github.mikephil.charting.components.LegendEntry r6 = new com.github.mikephil.charting.components.LegendEntry
            java.lang.String r7 = r4.getLabel()
            com.github.mikephil.charting.components.Legend$LegendForm r8 = com.github.mikephil.charting.components.Legend.LegendForm.NONE
            r11 = 0
            r12 = 1122867(0x112233, float:1.573472E-39)
            r9 = 2143289344(0x7fc00000, float:NaN)
            r10 = 2143289344(0x7fc00000, float:NaN)
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r5.add(r6)
            goto L18b
        Lf0:
            boolean r7 = r4 instanceof com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
            if (r7 == 0) goto L143
            r7 = r4
            com.github.mikephil.charting.interfaces.datasets.ICandleDataSet r7 = (com.github.mikephil.charting.interfaces.datasets.ICandleDataSet) r7
            int r8 = r7.getDecreasingColor()
            r9 = 1122867(0x112233, float:1.573472E-39)
            if (r8 == r9) goto L143
            int r16 = r7.getDecreasingColor()
            int r5 = r7.getIncreasingColor()
            java.util.List<com.github.mikephil.charting.components.LegendEntry> r6 = r0.computedEntries
            com.github.mikephil.charting.components.LegendEntry r10 = new com.github.mikephil.charting.components.LegendEntry
            com.github.mikephil.charting.components.Legend$LegendForm r12 = r4.getForm()
            float r13 = r4.getFormSize()
            float r14 = r4.getFormLineWidth()
            android.graphics.DashPathEffect r15 = r4.getFormLineDashEffect()
            r11 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r6.add(r10)
            java.util.List<com.github.mikephil.charting.components.LegendEntry> r6 = r0.computedEntries
            com.github.mikephil.charting.components.LegendEntry r8 = new com.github.mikephil.charting.components.LegendEntry
            java.lang.String r9 = r4.getLabel()
            com.github.mikephil.charting.components.Legend$LegendForm r10 = r4.getForm()
            float r11 = r4.getFormSize()
            float r12 = r4.getFormLineWidth()
            android.graphics.DashPathEffect r13 = r4.getFormLineDashEffect()
            r14 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r6.add(r8)
            goto L18b
        L143:
            r7 = 0
        L144:
            int r8 = r5.size()
            if (r7 >= r8) goto L18b
            if (r7 >= r6) goto L18b
            int r8 = r5.size()
            int r8 = r8 + (-1)
            if (r7 >= r8) goto L15b
            int r8 = r6 + (-1)
            if (r7 >= r8) goto L15b
            r8 = 0
        L159:
            r10 = r8
            goto L164
        L15b:
            com.github.mikephil.charting.interfaces.datasets.IDataSet r8 = r1.getDataSetByIndex(r3)
            java.lang.String r8 = r8.getLabel()
            goto L159
        L164:
            java.util.List<com.github.mikephil.charting.components.LegendEntry> r8 = r0.computedEntries
            com.github.mikephil.charting.components.LegendEntry r9 = new com.github.mikephil.charting.components.LegendEntry
            com.github.mikephil.charting.components.Legend$LegendForm r11 = r4.getForm()
            float r12 = r4.getFormSize()
            float r13 = r4.getFormLineWidth()
            android.graphics.DashPathEffect r14 = r4.getFormLineDashEffect()
            java.lang.Object r15 = r5.get(r7)
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r8.add(r9)
            int r7 = r7 + 1
            goto L144
        L18b:
            int r3 = r3 + 1
            goto L13
        L18f:
            com.github.mikephil.charting.components.Legend r1 = r0.mLegend
            com.github.mikephil.charting.components.LegendEntry[] r1 = r1.getExtraEntries()
            if (r1 == 0) goto L1a2
            java.util.List<com.github.mikephil.charting.components.LegendEntry> r1 = r0.computedEntries
            com.github.mikephil.charting.components.Legend r2 = r0.mLegend
            com.github.mikephil.charting.components.LegendEntry[] r2 = r2.getExtraEntries()
            java.util.Collections.addAll(r1, r2)
        L1a2:
            com.github.mikephil.charting.components.Legend r1 = r0.mLegend
            java.util.List<com.github.mikephil.charting.components.LegendEntry> r2 = r0.computedEntries
            r1.setEntries(r2)
        L1a9:
            com.github.mikephil.charting.components.Legend r1 = r0.mLegend
            android.graphics.Typeface r1 = r1.getTypeface()
            if (r1 == 0) goto L1b6
            android.graphics.Paint r2 = r0.mLegendLabelPaint
            r2.setTypeface(r1)
        L1b6:
            android.graphics.Paint r1 = r0.mLegendLabelPaint
            com.github.mikephil.charting.components.Legend r2 = r0.mLegend
            float r2 = r2.getTextSize()
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r0.mLegendLabelPaint
            com.github.mikephil.charting.components.Legend r2 = r0.mLegend
            int r2 = r2.getTextColor()
            r1.setColor(r2)
            com.github.mikephil.charting.components.Legend r1 = r0.mLegend
            android.graphics.Paint r2 = r0.mLegendLabelPaint
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r0.mViewPortHandler
            r1.calculateDimensions(r2, r3)
            return
    }

    protected void drawForm(android.graphics.Canvas r11, float r12, float r13, com.github.mikephil.charting.components.LegendEntry r14, com.github.mikephil.charting.components.Legend r15) {
            r10 = this;
            int r0 = r14.formColor
            r1 = 1122868(0x112234, float:1.573473E-39)
            if (r0 == r1) goto Lbe
            r1 = 1122867(0x112233, float:1.573472E-39)
            if (r0 == r1) goto Lbe
            if (r0 != 0) goto L10
            goto Lbe
        L10:
            int r0 = r11.save()
            com.github.mikephil.charting.components.Legend$LegendForm r1 = r14.form
            com.github.mikephil.charting.components.Legend$LegendForm r2 = com.github.mikephil.charting.components.Legend.LegendForm.DEFAULT
            if (r1 != r2) goto L1e
            com.github.mikephil.charting.components.Legend$LegendForm r1 = r15.getForm()
        L1e:
            android.graphics.Paint r2 = r10.mLegendFormPaint
            int r3 = r14.formColor
            r2.setColor(r3)
            float r2 = r14.formSize
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 == 0) goto L32
            float r2 = r15.getFormSize()
            goto L34
        L32:
            float r2 = r14.formSize
        L34:
            float r2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r2)
            r3 = 1073741824(0x40000000, float:2.0)
            float r3 = r2 / r3
            int[] r4 = com.github.mikephil.charting.renderer.LegendRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm
            int r1 = r1.ordinal()
            r1 = r4[r1]
            r4 = 3
            if (r1 == r4) goto Lab
            r4 = 4
            if (r1 == r4) goto Lab
            r4 = 5
            if (r1 == r4) goto L96
            r3 = 6
            if (r1 == r3) goto L52
        L50:
            r4 = r11
            goto Lbb
        L52:
            float r1 = r14.formLineWidth
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L5f
            float r1 = r15.getFormLineWidth()
            goto L61
        L5f:
            float r1 = r14.formLineWidth
        L61:
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            android.graphics.DashPathEffect r14 = r14.formLineDashEffect
            if (r14 != 0) goto L6d
            android.graphics.DashPathEffect r14 = r15.getFormLineDashEffect()
        L6d:
            android.graphics.Paint r15 = r10.mLegendFormPaint
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r15.setStyle(r3)
            android.graphics.Paint r15 = r10.mLegendFormPaint
            r15.setStrokeWidth(r1)
            android.graphics.Paint r15 = r10.mLegendFormPaint
            r15.setPathEffect(r14)
            android.graphics.Path r14 = r10.mLineFormPath
            r14.reset()
            android.graphics.Path r14 = r10.mLineFormPath
            r14.moveTo(r12, r13)
            android.graphics.Path r14 = r10.mLineFormPath
            float r12 = r12 + r2
            r14.lineTo(r12, r13)
            android.graphics.Path r12 = r10.mLineFormPath
            android.graphics.Paint r13 = r10.mLegendFormPaint
            r11.drawPath(r12, r13)
            goto L50
        L96:
            android.graphics.Paint r14 = r10.mLegendFormPaint
            android.graphics.Paint$Style r15 = android.graphics.Paint.Style.FILL
            r14.setStyle(r15)
            float r6 = r13 - r3
            float r7 = r12 + r2
            float r8 = r13 + r3
            android.graphics.Paint r9 = r10.mLegendFormPaint
            r4 = r11
            r5 = r12
            r4.drawRect(r5, r6, r7, r8, r9)
            goto Lbb
        Lab:
            r4 = r11
            r5 = r12
            android.graphics.Paint r11 = r10.mLegendFormPaint
            android.graphics.Paint$Style r12 = android.graphics.Paint.Style.FILL
            r11.setStyle(r12)
            float r12 = r5 + r3
            android.graphics.Paint r11 = r10.mLegendFormPaint
            r4.drawCircle(r12, r13, r3, r11)
        Lbb:
            r4.restoreToCount(r0)
        Lbe:
            return
    }

    protected void drawLabel(android.graphics.Canvas r2, float r3, float r4, java.lang.String r5) {
            r1 = this;
            android.graphics.Paint r0 = r1.mLegendLabelPaint
            r2.drawText(r5, r3, r4, r0)
            return
    }

    public android.graphics.Paint getFormPaint() {
            r1 = this;
            android.graphics.Paint r0 = r1.mLegendFormPaint
            return r0
    }

    public android.graphics.Paint getLabelPaint() {
            r1 = this;
            android.graphics.Paint r0 = r1.mLegendLabelPaint
            return r0
    }

    public void renderLegend(android.graphics.Canvas r31) {
            r30 = this;
            r0 = r30
            com.github.mikephil.charting.components.Legend r1 = r0.mLegend
            boolean r1 = r1.isEnabled()
            if (r1 != 0) goto Lc
            goto L394
        Lc:
            com.github.mikephil.charting.components.Legend r1 = r0.mLegend
            android.graphics.Typeface r1 = r1.getTypeface()
            if (r1 == 0) goto L19
            android.graphics.Paint r2 = r0.mLegendLabelPaint
            r2.setTypeface(r1)
        L19:
            android.graphics.Paint r1 = r0.mLegendLabelPaint
            com.github.mikephil.charting.components.Legend r2 = r0.mLegend
            float r2 = r2.getTextSize()
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r0.mLegendLabelPaint
            com.github.mikephil.charting.components.Legend r2 = r0.mLegend
            int r2 = r2.getTextColor()
            r1.setColor(r2)
            android.graphics.Paint r1 = r0.mLegendLabelPaint
            android.graphics.Paint$FontMetrics r2 = r0.legendFontMetrics
            float r6 = com.github.mikephil.charting.utils.Utils.getLineHeight(r1, r2)
            android.graphics.Paint r1 = r0.mLegendLabelPaint
            android.graphics.Paint$FontMetrics r2 = r0.legendFontMetrics
            float r1 = com.github.mikephil.charting.utils.Utils.getLineSpacing(r1, r2)
            com.github.mikephil.charting.components.Legend r2 = r0.mLegend
            float r2 = r2.getYEntrySpace()
            float r2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r2)
            float r7 = r1 + r2
            android.graphics.Paint r1 = r0.mLegendLabelPaint
            java.lang.String r2 = "ABC"
            int r1 = com.github.mikephil.charting.utils.Utils.calcTextHeight(r1, r2)
            float r1 = (float) r1
            r8 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r8
            float r9 = r6 - r1
            com.github.mikephil.charting.components.Legend r1 = r0.mLegend
            com.github.mikephil.charting.components.LegendEntry[] r10 = r1.getEntries()
            com.github.mikephil.charting.components.Legend r1 = r0.mLegend
            float r1 = r1.getFormToTextSpace()
            float r11 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            com.github.mikephil.charting.components.Legend r1 = r0.mLegend
            float r1 = r1.getXEntrySpace()
            float r12 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            com.github.mikephil.charting.components.Legend r1 = r0.mLegend
            com.github.mikephil.charting.components.Legend$LegendOrientation r1 = r1.getOrientation()
            com.github.mikephil.charting.components.Legend r2 = r0.mLegend
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r13 = r2.getHorizontalAlignment()
            com.github.mikephil.charting.components.Legend r2 = r0.mLegend
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r2 = r2.getVerticalAlignment()
            com.github.mikephil.charting.components.Legend r3 = r0.mLegend
            com.github.mikephil.charting.components.Legend$LegendDirection r14 = r3.getDirection()
            com.github.mikephil.charting.components.Legend r3 = r0.mLegend
            float r3 = r3.getFormSize()
            float r15 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r3)
            com.github.mikephil.charting.components.Legend r3 = r0.mLegend
            float r3 = r3.getStackSpace()
            float r3 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r3)
            com.github.mikephil.charting.components.Legend r4 = r0.mLegend
            float r4 = r4.getYOffset()
            com.github.mikephil.charting.components.Legend r5 = r0.mLegend
            float r5 = r5.getXOffset()
            int[] r16 = com.github.mikephil.charting.renderer.LegendRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment
            int r17 = r13.ordinal()
            r18 = 1073741824(0x40000000, float:2.0)
            r8 = r16[r17]
            r16 = r2
            r2 = 2
            r19 = 0
            r20 = r6
            r6 = 1
            if (r8 == r6) goto L132
            if (r8 == r2) goto L112
            r2 = 3
            if (r8 == r2) goto Lc9
            r22 = r3
            r8 = 0
            goto L14c
        Lc9:
            com.github.mikephil.charting.components.Legend$LegendOrientation r2 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL
            if (r1 != r2) goto Ld6
            com.github.mikephil.charting.utils.ViewPortHandler r8 = r0.mViewPortHandler
            float r8 = r8.getChartWidth()
            float r8 = r8 / r18
            goto Le5
        Ld6:
            com.github.mikephil.charting.utils.ViewPortHandler r8 = r0.mViewPortHandler
            float r8 = r8.contentLeft()
            com.github.mikephil.charting.utils.ViewPortHandler r6 = r0.mViewPortHandler
            float r6 = r6.contentWidth()
            float r6 = r6 / r18
            float r8 = r8 + r6
        Le5:
            com.github.mikephil.charting.components.Legend$LegendDirection r6 = com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT
            r22 = r3
            if (r14 != r6) goto Led
            r3 = r5
            goto Lee
        Led:
            float r3 = -r5
        Lee:
            float r8 = r8 + r3
            if (r1 != r2) goto L14c
            double r2 = (double) r8
            r23 = 4611686018427387904(0x4000000000000000, double:2.0)
            if (r14 != r6) goto L103
            com.github.mikephil.charting.components.Legend r6 = r0.mLegend
            float r6 = r6.mNeededWidth
            float r6 = -r6
            r25 = r2
            double r2 = (double) r6
            double r2 = r2 / r23
            double r5 = (double) r5
            double r2 = r2 + r5
            goto L10e
        L103:
            r25 = r2
            com.github.mikephil.charting.components.Legend r2 = r0.mLegend
            float r2 = r2.mNeededWidth
            double r2 = (double) r2
            double r2 = r2 / r23
            double r5 = (double) r5
            double r2 = r2 - r5
        L10e:
            double r2 = r25 + r2
            float r8 = (float) r2
            goto L14c
        L112:
            r22 = r3
            com.github.mikephil.charting.components.Legend$LegendOrientation r2 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL
            if (r1 != r2) goto L121
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r0.mViewPortHandler
            float r2 = r2.getChartWidth()
        L11e:
            float r2 = r2 - r5
            r8 = r2
            goto L128
        L121:
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r0.mViewPortHandler
            float r2 = r2.contentRight()
            goto L11e
        L128:
            com.github.mikephil.charting.components.Legend$LegendDirection r2 = com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT
            if (r14 != r2) goto L14c
            com.github.mikephil.charting.components.Legend r2 = r0.mLegend
            float r2 = r2.mNeededWidth
            float r8 = r8 - r2
            goto L14c
        L132:
            r22 = r3
            com.github.mikephil.charting.components.Legend$LegendOrientation r2 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL
            if (r1 != r2) goto L139
            goto L140
        L139:
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r0.mViewPortHandler
            float r2 = r2.contentLeft()
            float r5 = r5 + r2
        L140:
            com.github.mikephil.charting.components.Legend$LegendDirection r2 = com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT
            if (r14 != r2) goto L14b
            com.github.mikephil.charting.components.Legend r2 = r0.mLegend
            float r2 = r2.mNeededWidth
            float r8 = r5 + r2
            goto L14c
        L14b:
            r8 = r5
        L14c:
            int[] r2 = com.github.mikephil.charting.renderer.LegendRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L249
            r3 = 2
            if (r1 == r3) goto L15c
            goto L394
        L15c:
            int[] r1 = com.github.mikephil.charting.renderer.LegendRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment
            int r5 = r16.ordinal()
            r1 = r1[r5]
            if (r1 == r2) goto L19a
            if (r1 == r3) goto L182
            r2 = 3
            if (r1 == r2) goto L16d
            r1 = 0
            goto L1a7
        L16d:
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r0.mViewPortHandler
            float r1 = r1.getChartHeight()
            float r1 = r1 / r18
            com.github.mikephil.charting.components.Legend r2 = r0.mLegend
            float r3 = r2.mNeededHeight
            float r3 = r3 / r18
            float r1 = r1 - r3
            float r2 = r2.getYOffset()
            float r1 = r1 + r2
            goto L1a7
        L182:
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r1 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER
            if (r13 != r1) goto L18d
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r0.mViewPortHandler
            float r1 = r1.getChartHeight()
            goto L193
        L18d:
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r0.mViewPortHandler
            float r1 = r1.contentBottom()
        L193:
            com.github.mikephil.charting.components.Legend r2 = r0.mLegend
            float r2 = r2.mNeededHeight
            float r2 = r2 + r4
            float r1 = r1 - r2
            goto L1a7
        L19a:
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r1 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER
            if (r13 != r1) goto L1a0
            r1 = 0
            goto L1a6
        L1a0:
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r0.mViewPortHandler
            float r1 = r1.contentTop()
        L1a6:
            float r1 = r1 + r4
        L1a7:
            r12 = r1
            r1 = 0
            r13 = 0
            r16 = 0
        L1ac:
            int r2 = r10.length
            if (r1 >= r2) goto L394
            r4 = r10[r1]
            com.github.mikephil.charting.components.Legend$LegendForm r2 = r4.form
            com.github.mikephil.charting.components.Legend$LegendForm r3 = com.github.mikephil.charting.components.Legend.LegendForm.NONE
            if (r2 == r3) goto L1ba
            r17 = 1
            goto L1bc
        L1ba:
            r17 = 0
        L1bc:
            float r2 = r4.formSize
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 == 0) goto L1c7
            r18 = r15
            goto L1cf
        L1c7:
            float r2 = r4.formSize
            float r2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r2)
            r18 = r2
        L1cf:
            if (r17 == 0) goto L1f8
            com.github.mikephil.charting.components.Legend$LegendDirection r2 = com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT
            if (r14 != r2) goto L1d8
            float r3 = r8 + r16
            goto L1dc
        L1d8:
            float r3 = r18 - r16
            float r3 = r8 - r3
        L1dc:
            float r5 = r12 + r9
            r21 = r2
            r2 = r3
            r3 = r5
            com.github.mikephil.charting.components.Legend r5 = r0.mLegend
            r6 = r22
            r22 = r7
            r7 = r21
            r21 = r1
            r1 = r31
            r0.drawForm(r1, r2, r3, r4, r5)
            if (r14 != r7) goto L1f6
            float r3 = r2 + r18
            goto L201
        L1f6:
            r3 = r2
            goto L201
        L1f8:
            r21 = r1
            r6 = r22
            r1 = r31
            r22 = r7
            r3 = r8
        L201:
            java.lang.String r2 = r4.label
            if (r2 == 0) goto L23b
            if (r17 == 0) goto L212
            if (r13 != 0) goto L212
            com.github.mikephil.charting.components.Legend$LegendDirection r5 = com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT
            if (r14 != r5) goto L20f
            r5 = r11
            goto L210
        L20f:
            float r5 = -r11
        L210:
            float r3 = r3 + r5
            goto L215
        L212:
            if (r13 == 0) goto L215
            r3 = r8
        L215:
            com.github.mikephil.charting.components.Legend$LegendDirection r5 = com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT
            if (r14 != r5) goto L221
            android.graphics.Paint r5 = r0.mLegendLabelPaint
            int r2 = com.github.mikephil.charting.utils.Utils.calcTextWidth(r5, r2)
            float r2 = (float) r2
            float r3 = r3 - r2
        L221:
            if (r13 != 0) goto L22b
            float r2 = r12 + r20
            java.lang.String r4 = r4.label
            r0.drawLabel(r1, r3, r2, r4)
            goto L235
        L22b:
            float r2 = r20 + r22
            float r12 = r12 + r2
            float r2 = r12 + r20
            java.lang.String r4 = r4.label
            r0.drawLabel(r1, r3, r2, r4)
        L235:
            float r2 = r20 + r22
            float r12 = r12 + r2
            r16 = 0
            goto L240
        L23b:
            float r18 = r18 + r6
            float r16 = r16 + r18
            r13 = 1
        L240:
            int r2 = r21 + 1
            r1 = r2
            r7 = r22
            r22 = r6
            goto L1ac
        L249:
            r1 = r31
            r6 = r22
            r22 = r7
            com.github.mikephil.charting.components.Legend r2 = r0.mLegend
            java.util.List r7 = r2.getCalculatedLineSizes()
            com.github.mikephil.charting.components.Legend r2 = r0.mLegend
            java.util.List r2 = r2.getCalculatedLabelSizes()
            com.github.mikephil.charting.components.Legend r3 = r0.mLegend
            java.util.List r3 = r3.getCalculatedLabelBreakPoints()
            int[] r5 = com.github.mikephil.charting.renderer.LegendRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment
            int r16 = r16.ordinal()
            r5 = r5[r16]
            r16 = r8
            r8 = 1
            if (r5 == r8) goto L292
            r8 = 2
            if (r5 == r8) goto L285
            r8 = 3
            if (r5 == r8) goto L276
            r4 = 0
            goto L292
        L276:
            com.github.mikephil.charting.utils.ViewPortHandler r5 = r0.mViewPortHandler
            float r5 = r5.getChartHeight()
            com.github.mikephil.charting.components.Legend r8 = r0.mLegend
            float r8 = r8.mNeededHeight
            float r5 = r5 - r8
            float r5 = r5 / r18
            float r4 = r4 + r5
            goto L292
        L285:
            com.github.mikephil.charting.utils.ViewPortHandler r5 = r0.mViewPortHandler
            float r5 = r5.getChartHeight()
            float r5 = r5 - r4
            com.github.mikephil.charting.components.Legend r4 = r0.mLegend
            float r4 = r4.mNeededHeight
            float r4 = r5 - r4
        L292:
            int r8 = r10.length
            r17 = r16
            r1 = 0
            r5 = 0
        L297:
            if (r5 >= r8) goto L394
            r19 = r4
            r4 = r10[r5]
            r21 = r2
            com.github.mikephil.charting.components.Legend$LegendForm r2 = r4.form
            r24 = r8
            com.github.mikephil.charting.components.Legend$LegendForm r8 = com.github.mikephil.charting.components.Legend.LegendForm.NONE
            if (r2 == r8) goto L2a9
            r8 = 1
            goto L2aa
        L2a9:
            r8 = 0
        L2aa:
            float r2 = r4.formSize
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 == 0) goto L2b5
            r25 = r15
            goto L2bd
        L2b5:
            float r2 = r4.formSize
            float r2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r2)
            r25 = r2
        L2bd:
            int r2 = r3.size()
            if (r5 >= r2) goto L2d7
            java.lang.Object r2 = r3.get(r5)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2d7
            float r2 = r20 + r22
            float r2 = r19 + r2
            r19 = r2
            r17 = r16
        L2d7:
            int r2 = (r17 > r16 ? 1 : (r17 == r16 ? 0 : -1))
            if (r2 != 0) goto L301
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r2 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER
            if (r13 != r2) goto L301
            int r2 = r7.size()
            if (r1 >= r2) goto L301
            com.github.mikephil.charting.components.Legend$LegendDirection r2 = com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT
            if (r14 != r2) goto L2f2
            java.lang.Object r2 = r7.get(r1)
            com.github.mikephil.charting.utils.FSize r2 = (com.github.mikephil.charting.utils.FSize) r2
            float r2 = r2.width
            goto L2fb
        L2f2:
            java.lang.Object r2 = r7.get(r1)
            com.github.mikephil.charting.utils.FSize r2 = (com.github.mikephil.charting.utils.FSize) r2
            float r2 = r2.width
            float r2 = -r2
        L2fb:
            float r2 = r2 / r18
            float r17 = r17 + r2
            int r1 = r1 + 1
        L301:
            r29 = r17
            r17 = r1
            r1 = r29
            java.lang.String r2 = r4.label
            if (r2 != 0) goto L30e
            r26 = 1
            goto L310
        L30e:
            r26 = 0
        L310:
            if (r8 == 0) goto L33b
            com.github.mikephil.charting.components.Legend$LegendDirection r2 = com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT
            if (r14 != r2) goto L318
            float r1 = r1 - r25
        L318:
            r2 = r1
            r1 = r3
            float r3 = r19 + r9
            r27 = r5
            com.github.mikephil.charting.components.Legend r5 = r0.mLegend
            r28 = r27
            r27 = r8
            r8 = r28
            r28 = r7
            r7 = r21
            r21 = r1
            r1 = r31
            r0.drawForm(r1, r2, r3, r4, r5)
            r3 = r1
            com.github.mikephil.charting.components.Legend$LegendDirection r1 = com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT
            if (r14 != r1) goto L339
            float r1 = r2 + r25
            goto L346
        L339:
            r1 = r2
            goto L346
        L33b:
            r28 = r7
            r27 = r8
            r7 = r21
            r21 = r3
            r8 = r5
            r3 = r31
        L346:
            if (r26 != 0) goto L37a
            if (r27 == 0) goto L352
            com.github.mikephil.charting.components.Legend$LegendDirection r2 = com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT
            if (r14 != r2) goto L350
            float r2 = -r11
            goto L351
        L350:
            r2 = r11
        L351:
            float r1 = r1 + r2
        L352:
            com.github.mikephil.charting.components.Legend$LegendDirection r2 = com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT
            if (r14 != r2) goto L35f
            java.lang.Object r5 = r7.get(r8)
            com.github.mikephil.charting.utils.FSize r5 = (com.github.mikephil.charting.utils.FSize) r5
            float r5 = r5.width
            float r1 = r1 - r5
        L35f:
            float r5 = r19 + r20
            java.lang.String r4 = r4.label
            r0.drawLabel(r3, r1, r5, r4)
            com.github.mikephil.charting.components.Legend$LegendDirection r4 = com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT
            if (r14 != r4) goto L373
            java.lang.Object r4 = r7.get(r8)
            com.github.mikephil.charting.utils.FSize r4 = (com.github.mikephil.charting.utils.FSize) r4
            float r4 = r4.width
            float r1 = r1 + r4
        L373:
            if (r14 != r2) goto L377
            float r2 = -r12
            goto L378
        L377:
            r2 = r12
        L378:
            float r1 = r1 + r2
            goto L382
        L37a:
            com.github.mikephil.charting.components.Legend$LegendDirection r2 = com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT
            if (r14 != r2) goto L380
            float r2 = -r6
            goto L378
        L380:
            r2 = r6
            goto L378
        L382:
            int r5 = r8 + 1
            r2 = r17
            r17 = r1
            r1 = r2
            r2 = r7
            r4 = r19
            r3 = r21
            r8 = r24
            r7 = r28
            goto L297
        L394:
            return
    }
}
