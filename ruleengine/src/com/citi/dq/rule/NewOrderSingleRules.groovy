package com.citi.dq.rule



import static com.citi.dq.rule.util.Tags.*



//Compare with http://www.quickfixj.org/quickfixj/usermanual/1.5.3/usage/validation.html



def getRules() {

    [



            TAG_11.mustBe.consistent,

            TAG_9.mustBe.numeric.and.equalTo(840),

            TAG_8.mustBe.oneOf("FIX.4.3", "FIX.4.4"),

            TAG_1.mustBe.equalTo("LdA"),

            TAG_11.mustNotBe.equalTo(TAG_13),

            TAG_126.mustBe.present.onlyIf(TAG_59.is.equalTo(0)),

            TAG_84.mustNotBe.greaterThan(0),

            TAG_11053.mustBe.absent.onlyIf(TAG_11052.is.equalTo(13))

    ]

}


