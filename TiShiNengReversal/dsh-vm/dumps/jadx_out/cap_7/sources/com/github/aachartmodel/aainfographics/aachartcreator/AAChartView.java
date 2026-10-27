package com.github.aachartmodel.aainfographics.aachartcreator;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class AAChartView extends android.webkit.WebView {
    private java.util.HashMap _$_findViewCache;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aachartcreator.AAChartView.AAChartViewCallBack callBack;

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean chartSeriesHidden;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number contentHeight;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number contentWidth;

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean isClearBackgroundColor;
    private java.lang.String optionsJson;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface AAChartViewCallBack {
        void chartViewDidFinishLoad(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartView r1);

        void chartViewMoveOverEventMessage(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartView r1, @org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAMoveOverEventMessageModel r2);
    }

    public AAChartView(@org.jetbrains.annotations.NotNull android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>(r2)
            r1.setupBasicContent()
            return
    }

    public AAChartView(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.Nullable android.util.AttributeSet r3) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>(r2, r3)
            r1.setupBasicContent()
            return
    }

    public AAChartView(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.Nullable android.util.AttributeSet r3, int r4) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>(r2, r3, r4)
            r1.setupBasicContent()
            return
    }

    public static /* synthetic */ void aa_addPointToChartSeriesElement$default(com.github.aachartmodel.aainfographics.aachartcreator.AAChartView r0, int r1, java.lang.Object r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 1
        L5:
            r0.aa_addPointToChartSeriesElement(r1, r2, r3)
            return
    }

    public static final /* synthetic */ void access$configureChartOptionsAndDrawChart(com.github.aachartmodel.aainfographics.aachartcreator.AAChartView r0, com.github.aachartmodel.aainfographics.aachartcreator.AAOptions r1) {
            r0.configureChartOptionsAndDrawChart(r1)
            return
    }

    private final void configureChartOptionsAndDrawChart(com.github.aachartmodel.aainfographics.aachartcreator.AAOptions r3) {
            r2 = this;
            java.lang.Boolean r0 = r2.isClearBackgroundColor
            kotlin.jvm.internal.g0.m(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L17
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChart r0 = r3.getChart()
            kotlin.jvm.internal.g0.m(r0)
            java.lang.String r1 = "rgba(0,0,0,0)"
            r0.backgroundColor(r1)
        L17:
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            java.lang.String r3 = r0.toJson(r3)
            r2.optionsJson = r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "loadTheHighChartView('"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "','"
            r0.append(r3)
            java.lang.Number r1 = r2.contentWidth
            r0.append(r1)
            r0.append(r3)
            java.lang.Number r3 = r2.contentHeight
            r0.append(r3)
            java.lang.String r3 = "')"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.safeEvaluateJavaScriptString(r3)
            return
    }

    private final com.github.aachartmodel.aainfographics.aachartcreator.AAMoveOverEventMessageModel getEventMessageModel(java.util.Map<java.lang.String, ? extends java.lang.Object> r4) {
            r3 = this;
            com.github.aachartmodel.aainfographics.aachartcreator.AAMoveOverEventMessageModel r0 = new com.github.aachartmodel.aainfographics.aachartcreator.AAMoveOverEventMessageModel
            r0.<init>()
            java.lang.String r1 = "name"
            java.lang.Object r1 = r4.get(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.setName(r1)
            java.lang.String r1 = "x"
            java.lang.Object r1 = r4.get(r1)
            java.lang.Double r1 = (java.lang.Double) r1
            r0.setX(r1)
            java.lang.String r1 = "y"
            java.lang.Object r1 = r4.get(r1)
            java.lang.Double r1 = (java.lang.Double) r1
            r0.setY(r1)
            java.lang.String r1 = "category"
            java.lang.Object r1 = r4.get(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.setCategory(r1)
            java.lang.String r1 = "offset"
            java.lang.Object r1 = r4.get(r1)
            com.google.gson.internal.LinkedTreeMap r1 = (com.google.gson.internal.LinkedTreeMap) r1
            r0.setOffset(r1)
            java.lang.String r1 = "index"
            java.lang.Object r4 = r4.get(r1)
            java.lang.Double r4 = (java.lang.Double) r4
            if (r4 == 0) goto L54
            double r1 = r4.doubleValue()
            int r4 = (int) r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L55
        L54:
            r4 = 0
        L55:
            r0.setIndex(r4)
            return r0
    }

    private final void loadLocalFilesAndDrawChart(com.github.aachartmodel.aainfographics.aachartcreator.AAOptions r2) {
            r1 = this;
            java.lang.String r0 = "file:///android_asset/AAChartView.html"
            r1.loadUrl(r0)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartView$loadLocalFilesAndDrawChart$1 r0 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartView$loadLocalFilesAndDrawChart$1
            r0.<init>(r1, r2)
            r1.setWebViewClient(r0)
            return
    }

    private final void safeEvaluateJavaScriptString(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.isInEditMode()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "javascript:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartView$safeEvaluateJavaScriptString$1 r0 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartView$safeEvaluateJavaScriptString$1.INSTANCE
            r2.evaluateJavascript(r3, r0)
            return
    }

    @android.annotation.SuppressLint({"SetJavaScriptEnabled"})
    private final void setupBasicContent() {
            r2 = this;
            boolean r0 = r2.isInEditMode()
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 1137836032(0x43d20000, float:420.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.setContentWidth(r0)
            r0 = 1141964800(0x44110000, float:580.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.setContentHeight(r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.setClearBackgroundColor(r0)
            android.webkit.WebSettings r0 = r2.getSettings()
            java.lang.String r1 = "settings"
            kotlin.jvm.internal.g0.o(r0, r1)
            r1 = 1
            r0.setJavaScriptEnabled(r1)
            android.webkit.WebView.setWebContentsDebuggingEnabled(r1)
            java.lang.String r0 = "androidObject"
            r2.addJavascriptInterface(r2, r0)
            return
    }

    private final void showJavaScriptAlertView() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartView$showJavaScriptAlertView$1 r0 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartView$showJavaScriptAlertView$1
            r0.<init>(r1)
            r1.setWebChromeClient(r0)
            return
    }

    public void _$_clearFindViewByIdCache() {
            r1 = this;
            java.util.HashMap r0 = r1._$_findViewCache
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            return
    }

    public android.view.View _$_findCachedViewById(int r3) {
            r2 = this;
            java.util.HashMap r0 = r2._$_findViewCache
            if (r0 != 0) goto Lb
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2._$_findViewCache = r0
        Lb:
            java.util.HashMap r0 = r2._$_findViewCache
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r1)
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L26
            android.view.View r0 = r2.findViewById(r3)
            java.util.HashMap r1 = r2._$_findViewCache
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.put(r3, r0)
        L26:
            return r0
    }

    public final void aa_addElementToChartSeries(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement r3) {
            r2 = this;
            java.lang.String r0 = "aaSeriesElement"
            kotlin.jvm.internal.g0.p(r3, r0)
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            java.lang.String r3 = r0.toJson(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "addElementToChartSeriesWithElement('"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "')"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.safeEvaluateJavaScriptString(r3)
            return
    }

    @kotlin.jvm.JvmOverloads
    public final void aa_addPointToChartSeriesElement(int r7, @org.jetbrains.annotations.NotNull java.lang.Object r8) {
            r6 = this;
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            aa_addPointToChartSeriesElement$default(r0, r1, r2, r3, r4, r5)
            return
    }

    @kotlin.jvm.JvmOverloads
    public final void aa_addPointToChartSeriesElement(int r8, @org.jetbrains.annotations.NotNull java.lang.Object r9, boolean r10) {
            r7 = this;
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r9, r0)
            r4 = 1
            r6 = 1
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r1.aa_addPointToChartSeriesElement(r2, r3, r4, r5, r6)
            return
    }

    public final void aa_addPointToChartSeriesElement(int r3, @org.jetbrains.annotations.NotNull java.lang.Object r4, boolean r5, boolean r6, boolean r7) {
            r2 = this;
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L21
            boolean r0 = r4 instanceof java.lang.Float
            if (r0 != 0) goto L21
            boolean r0 = r4 instanceof java.lang.Double
            if (r0 == 0) goto L12
            goto L21
        L12:
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            java.lang.String r4 = r0.toJson(r4)
            java.lang.String r0 = "Gson().toJson(options)"
            kotlin.jvm.internal.g0.o(r4, r0)
            goto L25
        L21:
            java.lang.String r4 = r4.toString()
        L25:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "addPointToChartSeries('"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "','"
            r0.append(r3)
            r0.append(r4)
            r0.append(r3)
            r0.append(r5)
            r0.append(r3)
            r0.append(r6)
            r0.append(r3)
            r0.append(r7)
            java.lang.String r3 = "')"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.safeEvaluateJavaScriptString(r3)
            return
    }

    public final void aa_drawChartWithChartModel(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r2) {
            r1 = this;
            java.lang.String r0 = "chartModel"
            kotlin.jvm.internal.g0.p(r2, r0)
            com.github.aachartmodel.aainfographics.aachartcreator.AAOptions r2 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartModelKt.aa_toAAOptions(r2)
            r1.aa_drawChartWithChartOptions(r2)
            return
    }

    public final void aa_drawChartWithChartOptions(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAOptions r2) {
            r1 = this;
            java.lang.String r0 = "chartOptions"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = r1.optionsJson
            if (r0 == 0) goto Ld
            r1.aa_refreshChartWithChartOptions(r2)
            return
        Ld:
            r1.loadLocalFilesAndDrawChart(r2)
            r1.showJavaScriptAlertView()
            return
    }

    public final void aa_evaluateTheJavaScriptStringFunction(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "jsFunctionStr"
            kotlin.jvm.internal.g0.p(r3, r0)
            com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer r0 = com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer.INSTANCE
            java.lang.String r3 = r0.pureJavaScriptFunctionString(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "evaluateTheJavaScriptStringFunction('"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "')"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.safeEvaluateJavaScriptString(r3)
            return
    }

    public final void aa_hideTheSeriesElementContent(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "hideTheSeriesElementContentWithIndex('"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "')"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.safeEvaluateJavaScriptString(r3)
            return
    }

    public final void aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement[] r2) {
            r1 = this;
            java.lang.String r0 = "seriesElementsArr"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 1
            r1.aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(r2, r0)
            return
    }

    public final void aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement[] r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "seriesElementsArr"
            kotlin.jvm.internal.g0.p(r3, r0)
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            java.lang.String r3 = r0.toJson(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onlyRefreshTheChartDataWithSeries('"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "','"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = "')"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.safeEvaluateJavaScriptString(r3)
            return
    }

    public final void aa_refreshChartWithChartModel(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r2) {
            r1 = this;
            java.lang.String r0 = "chartModel"
            kotlin.jvm.internal.g0.p(r2, r0)
            com.github.aachartmodel.aainfographics.aachartcreator.AAOptions r2 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartModelKt.aa_toAAOptions(r2)
            r1.aa_refreshChartWithChartOptions(r2)
            return
    }

    public final void aa_refreshChartWithChartOptions(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAOptions r2) {
            r1 = this;
            java.lang.String r0 = "chartOptions"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.configureChartOptionsAndDrawChart(r2)
            return
    }

    public final void aa_removeElementFromChartSeries(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "removeElementFromChartSeriesWithElementIndex('"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "')"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.safeEvaluateJavaScriptString(r3)
            return
    }

    public final void aa_showTheSeriesElementContent(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "showTheSeriesElementContentWithIndex('"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "')"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.safeEvaluateJavaScriptString(r3)
            return
    }

    public final void aa_updateChartWithOptions(@org.jetbrains.annotations.NotNull java.lang.Object r8, boolean r9) {
            r7 = this;
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r8, r0)
            boolean r0 = r8 instanceof com.github.aachartmodel.aainfographics.aachartcreator.AAOptions
            if (r0 == 0) goto L18
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            java.lang.String r8 = r0.toJson(r8)
            java.lang.String r0 = "aaOptionsMapStr"
            kotlin.jvm.internal.g0.o(r8, r0)
            goto L7f
        L18:
            java.lang.Class r0 = r8.getClass()
            java.lang.String r1 = r0.getSimpleName()
            java.lang.String r0 = "classNameStr"
            kotlin.jvm.internal.g0.o(r1, r0)
            r5 = 4
            r6 = 0
            java.lang.String r2 = "AA"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.String r0 = kotlin.text.u.x2(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            if (r0 == 0) goto La7
            r2 = 0
            r3 = 1
            java.lang.String r2 = r0.substring(r2, r3)
            java.lang.String r4 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.g0.o(r2, r4)
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r5 = "Locale.ROOT"
            kotlin.jvm.internal.g0.o(r4, r5)
            if (r2 == 0) goto La1
            java.lang.String r1 = r2.toLowerCase(r4)
            java.lang.String r2 = "(this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.String r0 = r0.substring(r3)
            java.lang.String r2 = "(this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.g0.o(r0, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r1.put(r0, r8)
            com.google.gson.Gson r8 = new com.google.gson.Gson
            r8.<init>()
            java.lang.String r8 = r8.toJson(r1)
            java.lang.String r0 = "optionsStr"
            kotlin.jvm.internal.g0.o(r8, r0)
        L7f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "updateChart('"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = "','"
            r0.append(r8)
            r0.append(r9)
            java.lang.String r8 = "')"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.safeEvaluateJavaScriptString(r8)
            return
        La1:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            r8.<init>(r1)
            throw r8
        La7:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            r8.<init>(r1)
            throw r8
    }

    @android.webkit.JavascriptInterface
    @org.jetbrains.annotations.NotNull
    public final java.lang.String androidMethod(@org.jetbrains.annotations.Nullable java.lang.String r3) {
            r2 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.gson.Gson r1 = new com.google.gson.Gson
            r1.<init>()
            java.lang.Class r0 = r0.getClass()
            java.lang.Object r3 = r1.fromJson(r3, r0)
            java.lang.String r0 = "Gson().fromJson(message, messageBody.javaClass)"
            kotlin.jvm.internal.g0.o(r3, r0)
            java.util.HashMap r3 = (java.util.HashMap) r3
            com.github.aachartmodel.aainfographics.aachartcreator.AAMoveOverEventMessageModel r3 = r2.getEventMessageModel(r3)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartView$AAChartViewCallBack r0 = r2.callBack
            if (r0 == 0) goto L24
            r0.chartViewMoveOverEventMessage(r2, r3)
        L24:
            java.lang.String r3 = ""
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartView.AAChartViewCallBack getCallBack() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartView$AAChartViewCallBack r0 = r1.callBack
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getChartSeriesHidden() {
            r1 = this;
            java.lang.Boolean r0 = r1.chartSeriesHidden
            return r0
    }

    @Override // android.webkit.WebView
    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getContentHeight() {
            r1 = this;
            java.lang.Number r0 = r1.contentHeight
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getContentWidth() {
            r1 = this;
            java.lang.Number r0 = r1.contentWidth
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean isClearBackgroundColor() {
            r1 = this;
            java.lang.Boolean r0 = r1.isClearBackgroundColor
            return r0
    }

    public final void setCallBack(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aachartcreator.AAChartView.AAChartViewCallBack r1) {
            r0 = this;
            r0.callBack = r1
            return
    }

    public final void setChartSeriesHidden(@org.jetbrains.annotations.Nullable java.lang.Boolean r2) {
            r1 = this;
            r1.chartSeriesHidden = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "setChartSeriesHidden('"
            r2.append(r0)
            java.lang.Boolean r0 = r1.chartSeriesHidden
            r2.append(r0)
            java.lang.String r0 = "')"
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.safeEvaluateJavaScriptString(r2)
            return
    }

    public final void setClearBackgroundColor(@org.jetbrains.annotations.Nullable java.lang.Boolean r2) {
            r1 = this;
            r1.isClearBackgroundColor = r2
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r2 == 0) goto L18
            r2 = 0
            r1.setBackgroundColor(r2)
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            if (r0 == 0) goto L27
            r0.setAlpha(r2)
            return
        L18:
            r2 = 1
            r1.setBackgroundColor(r2)
            android.graphics.drawable.Drawable r2 = r1.getBackground()
            if (r2 == 0) goto L27
            r0 = 255(0xff, float:3.57E-43)
            r2.setAlpha(r0)
        L27:
            return
    }

    public final void setContentHeight(@org.jetbrains.annotations.Nullable java.lang.Number r2) {
            r1 = this;
            r1.contentHeight = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "setTheChartViewContentHeight('"
            r2.append(r0)
            java.lang.Number r0 = r1.contentHeight
            r2.append(r0)
            java.lang.String r0 = "')"
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.safeEvaluateJavaScriptString(r2)
            return
    }

    public final void setContentWidth(@org.jetbrains.annotations.Nullable java.lang.Number r2) {
            r1 = this;
            r1.contentWidth = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "setTheChartViewContentWidth('"
            r2.append(r0)
            java.lang.Number r0 = r1.contentWidth
            r2.append(r0)
            java.lang.String r0 = "')"
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.safeEvaluateJavaScriptString(r2)
            return
    }
}
