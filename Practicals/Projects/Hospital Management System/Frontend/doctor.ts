import { Patient } from "./patient";

export class Doctor
{
    did!:number;
    firstName!:string;
    lastName!:string;
    email!:string;
    specialization!:string;
    licenseNumber!:string;
    mobileNo!:string;
    patients?:Patient[];
}