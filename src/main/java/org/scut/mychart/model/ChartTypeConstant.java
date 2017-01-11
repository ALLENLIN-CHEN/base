package org.scut.mychart.model;

public interface ChartTypeConstant {
	
	//总人数
	public static final int TOTAL_PEOPLE = 140000;
	
	//仪表盘
	public static final String GAUGE = "gauge";
	
	/**
	 * 下面是用于设置redis的key
	 */
	//失业仪表盘
	public static final String OUTWORK_GAUGE_REDIS = "OUTWORK_GAUGE_REDIS";
	
	//养老仪表盘
	public static final String OLD_GAUGE_REDIS = "OLD_GAUGE_REDIS";
	
	//医疗仪表盘
	public static final String MEDICINE_GAUGE_REDIS = "MEDICINE_GAUGE_REDIS";
	
	//工伤仪表盘
	public static final String INJURY_GAUGE_REDIS = "INJURY_GAUGE_REDIS";
	
	//生育仪表盘
	public static final String BIRTH_GAUGE_REDIS = "BIRTH_GAUGE_REDIS";
	
	//养老柱状图
	public static final String ENDOWMENT_BAR_REDIS = "ENDOWMENT_BAR_REDIS";
	
	//失业柱状图
	public static final String UNEMPLOYMENT_BAR_REDIS = "UNEMPLOYMENT_BAR_REDIS";
	
	//医疗柱状图
	public static final String MEDICAL_BAR_REDIS = "MEDICAL_BAR_REDIS";
	
	//工伤柱状图
	public static final String INJURY_BAR_REDIS = "INJURY_BAR_REDIS";
	
	//生育柱状图
	public static final String BIRTH_BAR_REDIS = "BIRTH_BAR_REDIS";

	//养老折线图
	public static final String ENDOWMENT_LINE_REDIS = "ENDOWMENT_LINE_REDIS";
	
	//失业折线图
	public static final String UNEMPLOYMENT_LINE_REDIS = "UNEMPLOYMENT_LINE_REDIS";
	
	//医疗折线图
	public static final String MEDICAL_LINE_REDIS = "MEDICAL_LINE_REDIS";
	
	//工伤折线图
	public static final String INJURY_LINE_REDIS = "INJURY_LINE_REDIS";
	
	//生育折线图
	public static final String BIRTH_LINE_REDIS = "BIRTH_LINE_REDIS";
	
	//综合分析饼图
	public static final String ANALYSIS_PIE_REDIS = "ANALYSIS_PIE_REDIS";

	//雷达图
	public static final String Radar_REDIS = "Radar_REDIS";
	
	//漏斗图
	public static final String FUNNEL_REDIS = "FUNNEL_REDIS";
	
	//失业支付漏斗图
	public static final String UNEMPLOYMENT_FUNNEL_PAY_REDIS = "UNEMPLOYMENT_FUNNEL_PAY_REDIS";
	
	//养老支付漏斗图
	public static final String ENDOWMENT_FUNNEL_PAY_REDIS = "ENDOWMENT_FUNNEL_PAY_REDIS";
	
	//医疗支付漏斗图
	public static final String MEDICAL_FUNNEL_PAY_REDIS = "MEDICAL_FUNNEL_PAY_REDIS";
	
	//生育支付漏斗图
	public static final String BIRTH_FUNNEL_PAY_REDIS = "BIRTH_FUNNEL_PAY_REDIS";
	
	//工伤支付漏斗图
	public static final String INJURY_FUNNEL_PAY_REDIS = "INJURY_FUNNEL_PAY_REDIS";

	//韦恩图
	public static final String Venn_REDIS = "Venn_REDIS";

	//字符云
	public static final String WORDCLOUD_REDIS = "WORDCLOUD_REDIS";

	//hospital_2_2
	public static final String HOSPITAL_2_2_REDIS = "HOSPITAL_2_2_REDIS";

	//hospital_2_3
	public static final String HOSPITAL_2_3_REDIS = "HOSPITAL_2_3_REDIS";

	//hospital_2_4
	public static final String HOSPITAL_2_4_REDIS = "HOSPITAL_2_4_REDIS";

	//hospital_2_5
	public static final String HOSPITAL_2_5_REDIS = "HOSPITAL_2_5_REDIS";

	//hospital_2_6
	public static final String HOSPITAL_2_6_REDIS = "HOSPITAL_2_6_REDIS";

	//hospital_2_8
	public static final String HOSPITAL_2_8_REDIS = "HOSPITAL_2_8_REDIS";

	//hospital_2_10
	public static final String HOSPITAL_2_10_REDIS = "HOSPITAL_2_10_REDIS";

	//hospital_2_7
	public static final String HOSPITAL_2_7_REDIS = "HOSPITAL_2_7_REDIS";

	//hospital_2_9
	public static final String HOSPITAL_2_9_REDIS = "HOSPITAL_2_9_REDIS";

	//hospital_2_11
	public static final String HOSPITAL_2_11_REDIS = "HOSPITAL_2_11_REDIS";

	//hospital_2_maptest
	public static final String HOSPITAL_2_maptest_REDIS = "HOSPITAL_2_maptest_REDIS";

    //异地就医申请男女数量柱状图
	public static final  String EXTERNAL_REDIS ="EXTERNAL_REDIS";

	//异地就医申请男女数量折线图
	public static final  String EXTERNAL2_REDIS ="EXTERNAL2_REDIS";

	//异地就医申请孝南区覆盖率
	public static final String EXTERNAL3_XIAONANQU_REDIS="EXTERNAL3_XIAONANQU_REDIS";

	//异地就医申请孝南区覆盖率
	public static final String EXTERNAL3_XIAOCHANGQU_REDIS="EXTERNAL3_XIAOCHANGQU_REDIS";
	//异地就医申请孝南区覆盖率
	public static final String EXTERNAL3_DAWUXIAN_REDIS="EXTERNAL3_DAWUXIAN_REDIS";

	//异地就医申请孝南区覆盖率
	public static final String EXTERNAL3_YUNMENGXIAN_REDIS="EXTERNAL3_YUNMENGXIAN_REDIS";

	//异地就医申请孝南区覆盖率
	public static final String EXTERNAL3_ANLUSHI_REDIS="EXTERNAL3_ANLUSHI_REDIS";

	//异地就医申请孝南区覆盖率
	public static final String EXTERNAL3_YINGCHENGSHI_REDIS="EXTERNAL3_YINGCHENGSHI_REDIS";

	//异地就医申请孝南区覆盖率
	public static final String EXTERNAL3_HANCHUANSHI_REDIS="EXTERNAL3_HANCHUANSHI_REDIS";

	//异地就医申请漏斗图
	public static final  String EXTERNAL4_REDIS ="EXTERNAL4_REDIS";

	//异地就医申请医院low10 2010柱状图
	public static final  String EXTERNAL5_2010_REDIS ="EXTERNAL5_2010_REDIS";

	//异地就医申请医院low10 2011柱状图
	public static final  String EXTERNAL5_2011_REDIS ="EXTERNAL5_2011_REDIS";

	//异地就医申请医院low10 2012柱状图
	public static final  String EXTERNAL5_2012_REDIS ="EXTERNAL5_2012_REDIS";

	//异地就医申请医院low10 2013柱状图
	public static final  String EXTERNAL5_2013_REDIS ="EXTERNAL5_2013_REDIS";

	//异地就医申请医院low10 2014柱状图
	public static final  String EXTERNAL5_2014_REDIS ="EXTERNAL5_2014_REDIS";

	//异地就医申请医院low10 2015柱状图
	public static final  String EXTERNAL5_2015_REDIS ="EXTERNAL5_2015_REDIS";

	//异地就医申请科室low10 2010柱状图
	public static final  String EXTERNAL6_2010_REDIS ="EXTERNAL6_2010_REDIS";

	//异地就医申请科室low10 2011柱状图
	public static final  String EXTERNAL6_2011_REDIS ="EXTERNAL6_2011_REDIS";

	//异地就医申请科室low10 2012柱状图
	public static final  String EXTERNAL6_2012_REDIS ="EXTERNAL6_2012_REDIS";

	//异地就医申请科室low10 2013柱状图
	public static final  String EXTERNAL6_2013_REDIS ="EXTERNAL6_2013_REDIS";

	//异地就医申请科室low10 2014柱状图
	public static final  String EXTERNAL6_2014_REDIS ="EXTERNAL6_2014_REDIS";

	//异地就医申请科室low10 2015柱状图
	public static final  String EXTERNAL6_2015_REDIS ="EXTERNAL6_2015_REDIS";

	//异地就医申请医生low10 2010柱状图
	public static final  String EXTERNAL7_2010_REDIS ="EXTERNAL7_2010_REDIS";

	//异地就医申请医生low10 2011柱状图
	public static final  String EXTERNAL7_2011_REDIS ="EXTERNAL7_2011_REDIS";

	//异地就医申请医生low10 2012柱状图
	public static final  String EXTERNAL7_2012_REDIS ="EXTERNAL7_2012_REDIS";

	//异地就医申请医生low10 2013柱状图
	public static final  String EXTERNAL7_2013_REDIS ="EXTERNAL7_2013_REDIS";

	//异地就医申请医生low10 2014柱状图
	public static final  String EXTERNAL7_2014_REDIS ="EXTERNAL7_2014_REDIS";

	//异地就医申请医生low10 2015柱状图
	public static final  String EXTERNAL7_2015_REDIS ="EXTERNAL7_2015_REDIS";
}
