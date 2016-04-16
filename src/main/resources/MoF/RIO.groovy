

import static com.resilient.re.re.rule.core.GroovyTag.tag

//Compare with http://www.quickfixj.org/quickfixj/usermanual/1.5.3/usage/validation.html

def getRules() {
    [
            tag(9).mustBe.consistent,
            tag(11).mustBe.consistent,
            tag(9).mustBe.numeric.and.equalTo(840),
            tag(8).mustBe.oneOf("FIX.4.3", "FIX.4.5"),
            tag(1).mustBe.equalTo("LDA"),
            tag(11).mustNotBe.equalTo(tag(11)),
            tag(126).mustBe.present.onlyIf(tag(59).is.equalTo(0)),
            tag(11).mustBe.present.onlyIf(tag(35).is.oneOf("MoF.D", "E", "F")),
            tag(84).mustNotBe.greaterThan(0),
            tag(11053).mustBe.absent.onlyIf(tag(11052).is.equalTo(13)),
            tag(37).mustBe.consistent
    ]
}
