import "./styles.css";
import { ReactComponent as Youtube } from "./youtube.svg";
import { ReactComponent as Linkedin } from "./linkedin.svg";
import { ReactComponent as Instagram } from "./instagram.svg";

function Footer(){
    return (
        <footer className="main-footer">
            App desenvolvido durante a 2ª ed. do evento Semana DevSuperior
            <div className="footer-icons">
                <a href="https://www.youtube.com/channel/UC3twHmWQwtqEO7u-gB_2f7g" target="_new">
                    <Youtube />
                </a>

                <a href="https://www.linkedin.com/in/deyvisonuchoa/" target="_new">
                    <Linkedin />
                </a>

                <a href="https://www.instagram.com/deyvisonuchoa/" target="_new">
                    <Instagram />
                </a>
            </div>
        </footer>
    )
}
export default Footer;